package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Position {
    @Id
    private long idPosition;
    private Integer classement;
    private Integer nbPoints;

    public Position() {

    }
    public Position(Integer classement, Integer nbPoints) {
        this.classement = classement;
        this.nbPoints = nbPoints;
    }

    public Integer getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(Integer nbPoints) {
        this.nbPoints = nbPoints;
    }

    public Integer getClassement() {
        return classement;
    }

    public void setClassement(Integer classement) {
        this.classement = classement;
    }
}
