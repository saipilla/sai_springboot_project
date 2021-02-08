package example_spring;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
 
@RestController
@EnableAutoConfiguration
public class EXAMPLE_SPRING {
 
    @RequestMapping("/")
   public String home() {
        return "Hello World Spring Boot!";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(EXAMPLE_SPRING.class, args);
    }
 
}
