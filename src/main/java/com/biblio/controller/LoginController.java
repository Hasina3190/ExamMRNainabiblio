package com.biblio.controller;

import com.biblio.model.AdherantModel;
import com.biblio.model.BibliothecaireModel;
import com.biblio.service.AdherantService;
import com.biblio.service.BibliothecaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private AdherantService adherantService;

    @Autowired
    private BibliothecaireService bibliothecaireService;

    @GetMapping("/login")
    public String loginForm() {
        return "login"; // correspond à login.jsp
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("username") String email,
            @RequestParam("password") String password,
            @RequestParam("role") String role
            // HttpSession session
    ) {
        if ("ADHERANT".equals(role)) {
            AdherantModel adherant = adherantService.findByEmailAndMotDePasse(email, password);
            if (adherant != null) {
                // session.setAttribute("user", adherant);
                // session.setAttribute("role", "ADHERANT");
                return "adherant/dashboard";
            }
        } else if ("BIBLIO".equals(role)) {
            BibliothecaireModel biblio = bibliothecaireService.findByEmailAndMotDePasse(email, password);
            if (biblio != null) {
                // session.setAttribute("user", biblio);
                // session.setAttribute("role", "BIBLIO");
                return "index";
            }
        }

        // échec d'authentification
        return "redirect:/login/login?error=true";
    }

    // @GetMapping("/logout")
    // public String logout(HttpSession session) {
    //     session.invalidate();
    //     return "redirect:/login";
    // }
}
