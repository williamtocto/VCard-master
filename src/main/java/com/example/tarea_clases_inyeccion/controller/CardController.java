package com.example.tarea_clases_inyeccion.controller;

import com.example.tarea_clases_inyeccion.models.domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/card")
public class CardController {
    @Autowired
    private Card card;

    @GetMapping("/ver")
    public String index(Model model){
        model.addAttribute("card", card);
        model.addAttribute("titulo", "Card V");
        return "ver";
    }
}
