package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.SkiStation.Entities.Inscription;

public interface InscriptionRepo extends JpaRepository<Inscription,Long> {
}
