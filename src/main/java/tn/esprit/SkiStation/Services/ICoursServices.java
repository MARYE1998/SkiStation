package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Cours;

import java.util.List;

public interface ICoursServices {

    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    void remove(Long id);
}
