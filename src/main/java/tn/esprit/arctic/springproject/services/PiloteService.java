package tn.esprit.arctic.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.springproject.entities.Pilote;
import tn.esprit.arctic.springproject.repository.piloteRepository;

@Service
@AllArgsConstructor

public class PiloteService implements IPiloteService{
    piloteRepository pr;

    @Override
    public Pilote addPilote(Pilote pilote) {
        return pr.save(pilote);

    }
}
