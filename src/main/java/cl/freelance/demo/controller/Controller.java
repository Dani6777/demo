package cl.freelance.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hello")
    public String hello (){
        return "Hello World";
    }
    @GetMapping("/random")
    public String random(){
        return "Random";
    }

    @GetMapping("/name")
    public String index(@RequestParam(value="q") String name){
        return "The name is: " + name;
    }
}
