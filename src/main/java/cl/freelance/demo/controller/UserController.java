package cl.freelance.demo.controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Controller
@RequestMapping("/user")
public class UserController {

    Logger logger = Logger.getLogger(getClass().getName());

    @GetMapping("/home")
    public String index(HttpSession session){
        session.setAttribute("count", 0);
        Integer count = (Integer) session.getAttribute("count");
        return "/index";
    }

    @GetMapping("/admin")
    public String admin(Model model){
        model.addAttribute("name","Admin");
        logger.info("Procesando item: {}");
        return "/index";
    }

    @GetMapping("/fecha")
    public String fecha(Model model){
        Date fechaActual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd 'de' MMMM, yyyy");
        String fechaFormateada = sdf.format(fechaActual);
        model.addAttribute("fecha", fechaFormateada);
        return "/fecha";
    }

    @GetMapping("/hora")
    public String hora(Model model){
        Date hora = new Time( new Date().getTime());
        model.addAttribute("hora", hora);
        return "/hora";
    }
}
