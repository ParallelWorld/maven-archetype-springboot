package pw.parallelworld.plugin;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import pw.parallelworld.core.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class GlobalExceptionController extends BasicErrorController {

    public GlobalExceptionController() {
        super(new DefaultErrorAttributes(), new ErrorProperties());
    }

    @Override
    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = super.errorHtml(request, response);
        HttpStatus status = getStatus(request);
        modelAndView.addObject("httpStatus", status);
        if (status != null) {
            if (status.is4xxClientError()) {
                modelAndView.setViewName("error/4xx");
            } else if (status.is5xxServerError()) {
                modelAndView.setViewName("error/5xx");
            }
        }
        return modelAndView;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        return BeanMap.create(Result.error());
    }
}
