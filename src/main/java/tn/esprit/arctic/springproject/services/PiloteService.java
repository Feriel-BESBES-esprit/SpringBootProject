package tn.esprit.arctic.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.arctic.springproject.entities.Pilote;
import tn.esprit.arctic.springproject.repository.piloteRepository;

@Service
public class PiloteService implements IPiloteService{
    piloteRepository pr;

    @Override
    public String addPiole(Pilote pilote) {
        pr.save(pilote);
        return "added successfully ";
    }
}
