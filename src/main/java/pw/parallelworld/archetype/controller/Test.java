package pw.parallelworld.archetype.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.parallelworld.archetype.core.Result;
import pw.parallelworld.archetype.dao.UserRepo;
import pw.parallelworld.archetype.entity.User;

import javax.annotation.Resource;

@RestController
@Slf4j
public class Test {

    @Resource
    private UserRepo userRepo;

    @RequestMapping(value = "/hello")
    public Result hello() throws Exception {
//        throw new Exception("异常啊异常");
        log.info("还行吧");
        User user = new User();
        user.setName("mine");
        User save = userRepo.save(user);
        System.out.println(save);
        return Result.success("ahhaaha");
    }
}
