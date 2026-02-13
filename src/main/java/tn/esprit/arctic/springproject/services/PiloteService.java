package tn.esprit.arctic.springproject.services;

import tn.esprit.arctic.springproject.entities.Pilote;
import tn.esprit.arctic.springproject.repository.piloteRepository;

public class PiloteService implements IPiloteService{
    piloteRepository pr;

    @Override
    public String addPiole(Pilote pilote) {
        pr.save(pilote);
        return "added successfully ";
    }
}
