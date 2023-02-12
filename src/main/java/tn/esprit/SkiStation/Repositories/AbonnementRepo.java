package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.SkiStation.Entities.Abonnement;

public interface AbonnementRepo extends JpaRepository<Abonnement,Long> {
}
