package cn.case1.controller;

import cn.case1.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//控制器类
@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping(path = "/hello", method = {RequestMethod.GET}, params = {"username"}/*, headers = {"Referer"}*/)
    public String sayHello(String username) {
        System.out.println("hello springmvc");
        System.out.println(username);
        return "sucess";
    }

    @RequestMapping("saveUser")
    public String saveUser(User user) {
        System.out.println(user);
        return "sucess";
    }

    @GetMapping("/health")
    public @ResponseBody String health() {
        return "good health";
    }
}
