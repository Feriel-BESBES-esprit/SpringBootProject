package tn.esprit.arctic.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.springproject.entities.Contrat;

public interface contratRepository extends JpaRepository<Contrat, Long> {
    Double findSumMontantBySponsorIdSponsor(Long sponsorId);
    Double findSumMontantBy();

}
