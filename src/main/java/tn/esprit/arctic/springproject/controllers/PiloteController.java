package tn.esprit.arctic.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.springproject.services.PiloteService;

@Controller
@AllArgsConstructor
public class PiloteController {
    private PiloteService piloteService;
}