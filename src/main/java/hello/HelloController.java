package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
	System.out.println("Test12345");
        return "Greetings from Spring Boot!";
    }
    
}
