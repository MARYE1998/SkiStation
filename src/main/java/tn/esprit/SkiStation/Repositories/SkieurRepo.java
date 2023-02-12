package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.SkiStation.Entities.Skieur;

public interface SkieurRepo extends JpaRepository<Skieur,Long> {
}
