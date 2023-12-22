package com.example.helloworld;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @ResponseBody
@RestController
public class HelloController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World, Spring Boot!";
    }

}
