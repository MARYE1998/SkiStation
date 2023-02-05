package tn.esprit.SkiStation.Entities;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMonitor;
    String nomM;
    String prenomM;
    @Temporal(TemporalType.DATE)
    Date dateRecru ;

    @OneToMany
    Set<Cours> cours;

}