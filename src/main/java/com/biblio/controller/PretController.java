package com.biblio.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.biblio.model.AdherantModel;
import com.biblio.model.GestionPretModel;
import com.biblio.model.PretModel;
import com.biblio.model.TypePretModel;
import com.biblio.service.AbonnementService;
import com.biblio.service.AdherantService;
import com.biblio.service.ExemplaireService;
import com.biblio.service.GestionPretService;
import com.biblio.service.PretService;
import com.biblio.service.TypePretService;

@Controller
@RequestMapping("/pret")
public class PretController {

    @Autowired
    private AbonnementService abonnementService;
    @Autowired
    private PretService pretService;
    @Autowired
    private AdherantService adherantService;
    @Autowired
    private ExemplaireService exemplaireService;
    @Autowired
    private GestionPretService gestionPretService;
    @Autowired
    private TypePretService typePretService;

    @PostMapping("/enregistrer")
    public String enregistrerPret(
            @RequestParam("adherantId") Long adherantId,
            @RequestParam("exemplaireId") Long exemplaireId,
            @RequestParam("datePret") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate datePret,
            @RequestParam("dateRetour") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateRetour,
            @RequestParam("typePretId") Long typePretId,
            Model model) {

        AdherantModel adherant = adherantService.findAdherantById(adherantId);
        TypePretModel typePret = typePretService.getById(typePretId);

        // Vérification abonnement
        if (!abonnementService.estAdherantAbonnePendant(adherantId, datePret)) {
            model.addAttribute("message", "L'adhérant n'est pas abonné à la date du prêt.");
            return "pret/echec";
        }

        // Vérification si exemplaire déjà emprunté
        if (pretService.exemplaireDejaEmprunte(exemplaireId)) {
            model.addAttribute("message", "Cet exemplaire est déjà prêté.");
            return "pret/echec";
        }

        // Si prêt à domicile → vérifie le quota
        if ("domicile".equalsIgnoreCase(typePret.getLibelle())) {
            GestionPretModel gestion = gestionPretService.getByAdherant(adherant);
            int quota = (gestion != null) ? gestion.getNombreMax() : 0;
            long nbPretsEnCours = pretService.getNombrePretsEnCoursDomicile(adherantId);

            if (nbPretsEnCours >= quota) {
                model.addAttribute("message", "Quota de prêt à domicile atteint pour cet adhérant.");
                return "pret/echec";
            }
        }

        // Enregistrement
        PretModel pret = new PretModel();
        pret.setAdherant(adherant);
        pret.setExemplaire(exemplaireService.findByExemplaireId(exemplaireId));
        pret.setDatePret(datePret);
        pret.setDateRetour(dateRetour);
        pret.setTypePret(typePret);

        pretService.save(pret);
        return "redirect:/livre/listes";
    }


}
