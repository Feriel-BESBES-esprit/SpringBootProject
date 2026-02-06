package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contrat {
    @Id
    private Long idContrat;
    private Float montant;
    private String annee;
    private Boolean archived;

    public Contrat() {}
    public Contrat(Float montant, String annee, Boolean archived) {
        this.montant = montant;
        this.annee = annee;
        this.archived = archived;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }
}
