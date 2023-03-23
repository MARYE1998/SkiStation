package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.SkiStation.Entities.Moniteur;

public interface MoniteurRepo extends JpaRepository<Moniteur,Long> {
}
