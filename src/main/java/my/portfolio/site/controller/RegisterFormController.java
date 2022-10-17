package my.portfolio.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterFormController {

    @RequestMapping("/registerForm")
    public String registerForm() {
        return "registerForm";
    }
}
