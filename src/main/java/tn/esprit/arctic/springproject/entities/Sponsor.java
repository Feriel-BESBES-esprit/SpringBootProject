package tn.esprit.arctic.springproject.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Sponsor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idSponsor;

     String nom;
     String pays;
     Float budgetAnnuel;
     Boolean bloquerContrat;
     Boolean archived;
    LocalDate dateDerniereModification;
    LocalDate dateCreation;
    @OneToMany(mappedBy = "sponsor")
     List<Contrat> contrats = new ArrayList<>();

}