package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pilote {
    @Id
    private Long idPilote;
    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGenerale;
    private Categorie categorie;

    public Pilote() {}
    public Pilote(String libelleP, Integer nbPointsTotal, Integer classementGenerale , Categorie categorie) {
        this.libelleP = libelleP;
        this.nbPointsTotal = nbPointsTotal;
        this.classementGenerale = classementGenerale;
        this.categorie = categorie;


    }

    public Integer getClassementGenerale() {
        return classementGenerale;
    }

    public void setClassementGenerale(Integer classementGenerale) {
        this.classementGenerale = classementGenerale;
    }

    public String getLibelleP() {
        return libelleP;
    }

    public void setLibelleP(String libelleP) {
        this.libelleP = libelleP;
    }

    public Integer getNbPointsTotal() {
        return nbPointsTotal;
    }

    public void setNbPointsTotal(Integer nbPointsTotal) {
        this.nbPointsTotal = nbPointsTotal;
    }
}
