package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSponsor;

    private String nom;
    private String pays;
    private Float budgetAnnuel;
    private Boolean bloquerContrat;

    // 1:* bidirectional with Contrat
    @OneToMany(mappedBy = "sponsor")
    private List<Contrat> contrats = new ArrayList<>();

    public Sponsor() {
    }

    public Long getIdSponsor() { return idSponsor; }
    public void setIdSponsor(Long idSponsor) { this.idSponsor = idSponsor; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

    public Float getBudgetAnnuel() { return budgetAnnuel; }
    public void setBudgetAnnuel(Float budgetAnnuel) { this.budgetAnnuel = budgetAnnuel; }

    public Boolean getBloquerContrat() { return bloquerContrat; }
    public void setBloquerContrat(Boolean bloquerContrat) { this.bloquerContrat = bloquerContrat; }

    public List<Contrat> getContrats() { return contrats; }
    public void setContrats(List<Contrat> contrats) { this.contrats = contrats; }
}