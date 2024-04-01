package cl.freelance.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.logging.Logger;

@Controller
@RequestMapping("/user")
public class UserController {

    Logger logger = Logger.getLogger(getClass().getName());

    @GetMapping("/")
    public String index(@RequestParam(value="q",required=false) String name ){

        if(name == null){
            return "¡Bienvenido Usuario!";
        }else{
            return "¡Bienvenido " + name + "!";
        }
    }

    @GetMapping("/admin")
    public String admin(Model model){
        model.addAttribute("name","Admin");
        logger.info("Procesando item: {}");
        return "/index";
    }

    @GetMapping("/fecha")
    public String fecha(Model model){
        Date fecha = new Date();
        model.addAttribute("fecha", fecha);
        return "/fecha";
    }
}
