package tn.esprit.arctic.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.springproject.entities.Pilote;
import tn.esprit.arctic.springproject.services.IPiloteService;
import tn.esprit.arctic.springproject.services.PiloteService;

@RestController
@AllArgsConstructor
@RequestMapping("/pilote")

public class PiloteController {
    IPiloteService p;

    @PostMapping("/add-pilote")
    public Pilote addPilote(@RequestBody Pilote pilote){
        return p.addPilote(pilote);
}
}