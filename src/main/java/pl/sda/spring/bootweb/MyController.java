package pl.sda.spring.bootweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot! It's really awesome!";
    }
}
