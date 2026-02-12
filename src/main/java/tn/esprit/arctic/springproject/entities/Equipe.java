package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;

    private String libelle;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    // 1:* bidirectional with Pilote
    @OneToMany(mappedBy = "equipe")
    private List<Pilote> pilotes = new ArrayList<>();

    // 1:* bidirectional with Contrat
    @OneToMany(mappedBy = "equipe")
    private List<Contrat> contrats = new ArrayList<>();

    public Equipe() {
    }

    public Long getIdEquipe() { return idEquipe; }
    public void setIdEquipe(Long idEquipe) { this.idEquipe = idEquipe; }

    public String getLibelle() { return libelle; }
    public void setLibelle(String libelle) { this.libelle = libelle; }

    public Integer getNbPointsTotal() { return nbPointsTotal; }
    public void setNbPointsTotal(Integer nbPointsTotal) { this.nbPointsTotal = nbPointsTotal; }

    public Integer getClassementGeneral() { return classementGeneral; }
    public void setClassementGeneral(Integer classementGeneral) { this.classementGeneral = classementGeneral; }

    public List<Pilote> getPilotes() { return pilotes; }
    public void setPilotes(List<Pilote> pilotes) { this.pilotes = pilotes; }

    public List<Contrat> getContrats() { return contrats; }
    public void setContrats(List<Contrat> contrats) { this.contrats = contrats; }

    // Helper methods
    public void addPilote(Pilote pilote) {
        pilotes.add(pilote);
        pilote.setEquipe(this);
    }

    public void removePilote(Pilote pilote) {
        pilotes.remove(pilote);
        pilote.setEquipe(null);
    }
}