package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Championnat {
    @Id
    private long idChampionnat;
    Categorie categorie;
    private String libelleC;
    private Integer annee;

    public Championnat() {

    }

    public Championnat(Categorie categorie, String libelleC, Integer annee) {
        this.categorie = categorie;
        this.libelleC = libelleC;
        this.annee = annee;
    }


    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getLibelleC() {
        return libelleC;
    }

    public void setLibelleC(String libelleC) {
        this.libelleC = libelleC;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
