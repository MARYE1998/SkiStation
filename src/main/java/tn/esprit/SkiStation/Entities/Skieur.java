package tn.esprit.SkiStation.Entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Skieur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSkieur;
    String nomS;
    String prenomS;

    LocalDate dateNaissance;
    String ville;
    @OneToOne
    Abonnement abonnement;
    @ManyToMany
    @JsonIgnore
    Set<Piste>pistes;
    @OneToMany(mappedBy = "skieur" , cascade = CascadeType.REMOVE)
    Set<Inscription>inscriptions;



}

