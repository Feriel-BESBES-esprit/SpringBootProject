package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pilote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPilote;

    private String libelleP;
    private Integer nbPointsTotal;
    private Integer classementGeneral;

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    // Inverse side of 1:* with Position
    @OneToMany(mappedBy = "pilote")
    private List<Position> positions = new ArrayList<>();

    public Pilote() {
    }

    public Long getIdPilote() { return idPilote; }
    public void setIdPilote(Long idPilote) { this.idPilote = idPilote; }

    public String getLibelleP() { return libelleP; }
    public void setLibelleP(String libelleP) { this.libelleP = libelleP; }

    public Integer getNbPointsTotal() { return nbPointsTotal; }
    public void setNbPointsTotal(Integer nbPointsTotal) { this.nbPointsTotal = nbPointsTotal; }

    public Integer getClassementGeneral() { return classementGeneral; }
    public void setClassementGeneral(Integer classementGeneral) { this.classementGeneral = classementGeneral; }

    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }

    public Equipe getEquipe() { return equipe; }
    public void setEquipe(Equipe equipe) { this.equipe = equipe; }

    public List<Position> getPositions() { return positions; }
    public void setPositions(List<Position> positions) { this.positions = positions; }
}