package tn.esprit.SkiStation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.SkiStation.Entities.Cours;

public interface CoursRepo extends JpaRepository<Cours,Long> {
}
