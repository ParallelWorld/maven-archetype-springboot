package pw.parallelworld.archetype.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.parallelworld.archetype.core.Result;

@RestController
@Slf4j
public class Test {

    @RequestMapping(value = "/hello")
    public Result hello() throws Exception {
//        throw new Exception("异常啊异常");
        log.info("还行吧");
        return Result.success("ahhaaha");
    }
}
