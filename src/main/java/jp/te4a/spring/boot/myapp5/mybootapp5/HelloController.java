package jp.te4a.spring.boot.myapp5.mybootapp5;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 /**
 * Hello world!
 */
 @Controller
public class HelloController {
        @RequestMapping("/")
    public String index(Model model) {
    //return "this is Spring Boot sample.";
    return "index";
     }
    @RequestMapping("/miyagi")
     public String miyagi() {
     return "Miyagi desu!";
     }
}
