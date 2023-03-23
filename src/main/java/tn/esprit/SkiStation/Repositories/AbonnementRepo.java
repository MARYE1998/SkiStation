package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.SkiStation.Entities.Abonnement;
import tn.esprit.SkiStation.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.Set;

public interface AbonnementRepo extends JpaRepository<Abonnement,Long> {
    Set<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement);

    Set<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);
}
