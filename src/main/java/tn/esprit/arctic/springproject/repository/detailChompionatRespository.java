package tn.esprit.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.springproject.entities.Pilote;

public interface detailChompionatRespository extends JpaRepository<Pilote, Long> {
}
