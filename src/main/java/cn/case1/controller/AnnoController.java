package cn.case1.controller;

import cn.case1.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("anno")
@SessionAttributes({"msg"})     //把request域中的msg存入session域中
public class AnnoController {

    @RequestMapping("test1")
    public String test1(@RequestParam("username") String name) {
        System.out.println(name);
        return "sucess";
    }

    @RequestMapping("test2")
    public String test2(@RequestBody String body) {     //获取请求体(post)内容
        System.out.println(body);
        return "sucess";
    }

    @RequestMapping("test3/{sid}")
    public String test3(@PathVariable("sid") int id) {     //restful编程风格
        System.out.println(id);
        return "sucess";
    }

    @RequestMapping("test4")
    public String test4(@RequestHeader("referer") String header) {     //获取请求头
        System.out.println(header);
        return "sucess";
    }

    @RequestMapping("test5")
    public String test5(@CookieValue("JSESSIONID") String cookie, HttpServletRequest request) {     //获取请求头
        System.out.println(cookie);
        System.out.println(request.getSession().getId());
        return "sucess";
    }

    /*@RequestMapping("test6")
    public String test6(User user) {
        System.out.println(user);
        return "sucess";
    }
    @ModelAttribute
    public User fun(String username){
        User user = new User();
        user.setUsername(username);
        user.setPassword("12");
        user.setBirthday(new Date());
        return user;
    }*/

    @RequestMapping("test6")
    public String test6(@ModelAttribute("avc") User user) {
        System.out.println(user);
        return "sucess";
    }
    @ModelAttribute
    public void fun(String username, Map<String, User> map){
        User user = new User();
        user.setUsername(username);
        user.setPassword("12");
        user.setBirthday(new Date());
        map.put("avc", user);
    }


    @RequestMapping("test7")
    public String test7(Model model) {
        model.addAttribute("msg", "hello");     //存入request域中
        return "sucess";
    }

    @RequestMapping("test8")
    public String test8(ModelMap modelMap) {
        System.out.println(modelMap.get("msg"));
        return "sucess";
    }

}
