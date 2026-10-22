package lv.school.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = "text/plain;charset=UTF-8")
    public String start() {
        return "Hello, World!";
    }

    @GetMapping(value = "/par", produces = "text/plain;charset=UTF-8")
    public String par() {
        return "This is my first line at springboot.";
    }
}