package pw.parallelworld.archetype.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.parallelworld.archetype.core.Result;

@RestController
public class Test {

    @RequestMapping(value = "/hello")
    public Result hello() throws Exception {
        throw new Exception("异常啊异常");
//        return Result.success("ahhaaha");
    }
}
