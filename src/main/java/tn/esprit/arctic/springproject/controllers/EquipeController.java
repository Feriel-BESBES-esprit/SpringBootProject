package tn.esprit.arctic.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.springproject.entities.Equipe;
import tn.esprit.arctic.springproject.services.IEquipeService;


@RestController
@AllArgsConstructor
@RequestMapping("/equipe")

public class EquipeController {
    IEquipeService e;

    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe equipe){
        return e.ajouterEquipe(equipe);
    }
}
