package my.portfolio.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Register {

    @RequestMapping  ("/register")
    public void register(@RequestParam("id") String id, @RequestParam("pwd") String pwd, @RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}
