package mari.blog.api;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class UserApiController {

    @PostMapping("user/register")
    public void register(){
        log.info("api...............................");
    }

}
