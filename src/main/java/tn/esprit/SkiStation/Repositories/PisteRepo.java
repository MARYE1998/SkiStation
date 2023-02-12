package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.SkiStation.Entities.Piste;

public interface PisteRepo extends JpaRepository<Piste,Long> {
}
