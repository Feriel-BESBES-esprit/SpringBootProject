package tn.esprit.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.springproject.entities.Equipe;

public interface equipeRepository extends JpaRepository<Equipe, Long> {
}
