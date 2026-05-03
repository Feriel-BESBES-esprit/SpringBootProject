package tn.esprit.arctic.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.springproject.entities.Contrat;
import tn.esprit.arctic.springproject.entities.Sponsor;
import tn.esprit.arctic.springproject.repository.contratRepository;
import tn.esprit.arctic.springproject.repository.sponsorRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContrat{
    contratRepository cr;
    sponsorRepository sp;

    @Scheduled(fixedRate = 30000)
    public void archiverContratsExpireesEtAffichageContratsActifsParEquipe(){
        List<Contrat> contrats = cr.findAll();
        LocalDate today = LocalDate.now();
        for (Contrat contrat : contrats) {
            if ( !contrat.getArchived() && Integer.parseInt(contrat.getAnnee()) < today.getYear()){
                contrat.setArchived(true);
                cr.save(contrat);
            } else {
                if (!contrat.getArchived()) {
                    System.out.println("equipe : " + contrat.getEquipe() + "contrat :" + contrat);
                }
            }
        }

    }

    Double pourcentageBudgetAnnuelConsomme (Sponsor sponsor){
        return cr.findSumMontantBySponsorIdSponsor(sponsor.getIdSponsor()) / cr.findSumMontantBy() ;
    }
    @Scheduled(fixedRate = 30000)
    // @Scheduled(cron = "0 0 9 * * MON")
    void pourcentageMantant(){
        List<Sponsor> sponsors = sp.findAll();
        for (Sponsor sponsor : sponsors) {
            Double percentage = pourcentageBudgetAnnuelConsomme(sponsor);
            if (percentage > 0.7 && percentage < 1){
                System.out.println("attention budget presque consommé : 85 % !" );
            } else if (percentage > 1){
                System.out.println("attention budget presque consommé : 85 % ! ");
            }
        }

    }

    @Override
    public List<Contrat> getContrats() {
        return cr.findAll();
    }
}
