package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sponsor {
    @Id
    private Long idSponsor;
    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;

    public Sponsor() {}
    public Sponsor ( String nom, String pays, Float budgetAnnuel, Boolean bloquerContrat) {
        this.nom = nom;
        this.pays = pays;
        this.budgetAnnuel = budgetAnnuel;
        this.bloquerContrat = bloquerContrat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Float getBudgetAnnuel() {
        return budgetAnnuel;
    }

    public void setBudgetAnnuel(Float budgetAnnuel) {
        this.budgetAnnuel = budgetAnnuel;
    }

    public Boolean getBloquerContrat() {
        return bloquerContrat;
    }

    public void setBloquerContrat(Boolean bloquerContrat) {
        this.bloquerContrat = bloquerContrat;
    }
}
