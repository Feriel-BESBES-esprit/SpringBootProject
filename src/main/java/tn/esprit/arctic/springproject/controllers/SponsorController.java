package tn.esprit.arctic.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.springproject.services.SponsorService;

@Controller
@AllArgsConstructor
public class SponsorController {
    private SponsorService sponsorService;
}
