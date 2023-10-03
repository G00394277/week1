package ie.atu.week1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Greetings, good sir!";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Howdy " + name;
    }
    @GetMapping("/details")
    public String search(@RequestParam String name, String age) {
        return "Name: " + name + " Age: " + age;
    }
}