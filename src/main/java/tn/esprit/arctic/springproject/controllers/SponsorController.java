package tn.esprit.arctic.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.springproject.entities.Sponsor;
import tn.esprit.arctic.springproject.services.ISponsorService;
import tn.esprit.arctic.springproject.services.SponsorService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/sponsor")
public class SponsorController {
    ISponsorService s;

    @GetMapping("/retrieve-all-sponsors")
    public List<Sponsor> getPilotes() {
        return s.listSponsors();

    }

    @PostMapping("/add-sponsor")
    public Sponsor addSponsor(@RequestBody Sponsor sponsor) {
        return s.ajouterSponsor(sponsor);
    }

    @PostMapping("/ajouter-sponsors")
    public List<Sponsor> ajouterSponsors(@RequestBody List<Sponsor> sponsors ){
        return s.ajouterSponsors(sponsors);
    }
    @DeleteMapping("/{id}")
    public void supprimerSponsor(@PathVariable Long id) {
        s.supprimerSponsor(id);
    }
    @PutMapping("/archive/{id}")
    public Boolean archiverSponsor(@PathVariable Long id) {
        return s.archiverSponsor(id);
    }

}
