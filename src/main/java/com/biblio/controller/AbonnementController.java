package com.biblio.controller;

import com.biblio.model.AbonnementModel;
import com.biblio.model.AdherantModel;
import com.biblio.service.AbonnementService;
import com.biblio.service.AdherantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequestMapping("/abonnement")
public class AbonnementController {

    @Autowired
    private AbonnementService abonnementService;
    
    @Autowired
    private AdherantService adherantService;

    @GetMapping("/form")
    public String formAbonnement(Model model) {
        model.addAttribute("adherants", adherantService.findAllAdherant());
        return "abonnement/form"; // Vue Thymeleaf
    }

    @PostMapping("/enregistrer")
    public String enregistrerAbonnement(
        @RequestParam Long adherantId,
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateDebut,
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFin,
        Model model) {

        Optional<AdherantModel> adherantOpt = adherantService.findById(adherantId);

        if (adherantOpt.isPresent()) {
            if (abonnementService.aUnChevauchement(adherantId, dateDebut, dateFin)) {
                model.addAttribute("message", "Un abonnement existe déjà pendant cette période.");
            } else {
                AbonnementModel abonnement = new AbonnementModel(null, dateDebut, dateFin, adherantOpt.get());
                abonnementService.enregistrer(abonnement);
                model.addAttribute("message", "Abonnement enregistré avec succès.");
            }
        } else {
            model.addAttribute("message", "Adhérant introuvable.");
        }

        model.addAttribute("adherants", adherantService.findAllAdherant());
        return "redirect:/abonnement/form";
    }
}
