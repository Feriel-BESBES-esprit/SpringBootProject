package tn.esprit.arctic.springproject.controllers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import tn.esprit.arctic.springproject.services.PositionService;

@AllArgsConstructor
@Controller
public class PositionController {
    private PositionService positionService;
}
