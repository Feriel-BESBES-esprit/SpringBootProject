package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Equipe {
    @Id
    private Long idEquipe;
    private String libelle;
    private Integer nbPointsTotale;
    private Integer classementGenerale;

    public Equipe() {}
    public Equipe (String libelle, Integer nbPointsTotale, Integer classementGenerale) {
        this.libelle = libelle;
        this.nbPointsTotale = nbPointsTotale;
        this.classementGenerale = classementGenerale;

    }

    public Integer getClassementGenerale() {
        return classementGenerale;
    }

    public void setClassementGenerale(Integer classementGenerale) {
        this.classementGenerale = classementGenerale;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getNbPointsTotale() {
        return nbPointsTotale;
    }

    public void setNbPointsTotale(Integer nbPointsTotale) {
        this.nbPointsTotale = nbPointsTotale;
    }
}

