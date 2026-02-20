package tn.esprit.arctic.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.arctic.springproject.entities.Equipe;
import tn.esprit.arctic.springproject.repository.equipeRepository;

@Service
public class EquipeService implements IEquipeService {
    equipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
