package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.SkiStation.Entities.Skieur;
import tn.esprit.SkiStation.Entities.TypeAbonnement;
import tn.esprit.SkiStation.Entities.TypeCours;

import java.util.List;

public interface SkieurRepo extends JpaRepository<Skieur,Long> {

    List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement) ;
    List<Skieur> findByInscriptionsCoursTypeCours(TypeCours typeCours);
}
