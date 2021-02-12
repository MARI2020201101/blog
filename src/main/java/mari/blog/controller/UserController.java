package mari.blog.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log
public class UserController {

    @GetMapping("/user/register")
    public String register(){
        log.info("Register....................");
        return "/user/register";
    }

    @GetMapping("/user/login")
    public String login(){
        log.info("Login....................");
        return "/user/login";
    }
}
