package pl.sda.spring.bootweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String hello() {
        Course course = new Course();
        course.setName("SDA Java course");
        course.setLocation("Katowice");
        course.setMembersCount(18);
        return "Welcome on course: " + course;
    }
}
