package bj.universityh5.greeting.controller;
import org.springframework.web.bind.annotation.RestController;
import bj.universityh5.greeting.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;



@RestController
public class GreetingController {
    @GetMapping("/")
    public Greeting getMethodName(){
        return new Greeting(1,"hello world")
    }
AarrayList< >
}
