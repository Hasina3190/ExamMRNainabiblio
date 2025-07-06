package com.biblio.controller;

import com.biblio.model.AdherantModel;
import com.biblio.model.ExemplaireModel;
import com.biblio.model.LivreModel;
import com.biblio.model.TypePretModel;
import com.biblio.service.AdherantService;
import com.biblio.service.ExemplaireService;
import com.biblio.service.GenreService;
import com.biblio.service.LivreService;
import com.biblio.service.TypePretService;

import java.util.List;

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
    @Autowired
    private ExemplaireService exemplaireService;
    @Autowired
    private AdherantService adherantService;
    @Autowired
    private TypePretService typePretService;

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
    public String afficherFormPret(@RequestParam("id") Long livreId, Model model) {
        LivreModel livre = livreService.getById(livreId);
        List<ExemplaireModel> exemplaires = exemplaireService.findByLivreId(livreId);
        List<AdherantModel> adherants = adherantService.findAllAdherant();
        List<TypePretModel> typePrets = typePretService.getAll();

        model.addAttribute("livre", livre);
        model.addAttribute("exemplaires", exemplaires);
        model.addAttribute("adherants", adherants);
        model.addAttribute("typePrets", typePrets);
        
        return "pret/form";
    }


    @GetMapping("/reserver")
    public String reserverLivre(@RequestParam Long id, Model model) {
        model.addAttribute("message", "Préparation de la réservation pour le livre ID : " + id);
        return "livre/action";
    }

}
