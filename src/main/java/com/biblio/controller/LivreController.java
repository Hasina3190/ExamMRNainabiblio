package com.biblio.controller;

import com.biblio.model.LivreModel;
import com.biblio.service.GenreService;
import com.biblio.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/livre")
public class LivreController {

    @Autowired
    private LivreService livreService;
    
    @Autowired
    private GenreService genreService;

    @GetMapping("/listes")
    public String listeDesLivres(Model model) {
        model.addAttribute("livres", livreService.getAll());
        return "livre/liste"; // vers /WEB-INF/views/livre/liste.jsp
    }

    @GetMapping("/form")
    public String formLivre(Model model) {
        model.addAttribute("livre", new LivreModel());
        model.addAttribute("genres", genreService.findAll());
        return "livre/form";
    }


    @GetMapping("/preter")
    public String preterLivre(@RequestParam Long id, Model model) {
        model.addAttribute("message", "Préparation du prêt pour le livre ID : " + id);
        return "livre/action"; // à créer si besoin
    }

    @GetMapping("/reserver")
    public String reserverLivre(@RequestParam Long id, Model model) {
        model.addAttribute("message", "Préparation de la réservation pour le livre ID : " + id);
        return "livre/action";
    }

}
