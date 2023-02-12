package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Skieur;

import java.util.List;

public interface ISkieurServices {
    Skieur addSkieur(Skieur s);

    void removeSkieur(Long id);

    Skieur updateSkieur (Skieur s);

    List<Skieur> retrieveAllSkieurs ();

    Skieur retrieveSkieur (Long id);

}
