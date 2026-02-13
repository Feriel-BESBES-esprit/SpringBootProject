package tn.esprit.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.arctic.springproject.entities.Sponsor;

public interface sponsorRepository extends JpaRepository<Sponsor, Long> {

}
