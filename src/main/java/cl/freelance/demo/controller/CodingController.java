package cl.freelance.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

    @GetMapping("/")
    public String index(){
        return "¡Hola Coding Dojo!";
    }

    @GetMapping("/python")
    public String python(){
        return "Python/Django was awesome!";
    }
    @GetMapping("/java")
    public String java(){
        return "Java/Spring is better!";
    }
}
