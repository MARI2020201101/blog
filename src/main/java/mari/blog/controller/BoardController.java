package mari.blog.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log
public class BoardController {

    @GetMapping("/")
    public String home(){
        log.info("Home....................");
        return "index";
    }
}
