package cl.freelance.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {

    @GetMapping("/")
    public String index(){
        return "¡Bienvenidos a Coding Dojo!";
    }

    @GetMapping("/burbank")
    public String burbank(@RequestParam(value="q") String location){
        return "Burbank Dojo is located in " + location;
    }

    @GetMapping("/san-jose")
    public String sanJose(@RequestParam(value="q") String location){
        return "SJ dojo is the headquarters " + location;
    }
}
