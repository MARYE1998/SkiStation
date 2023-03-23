package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Skieur;
import tn.esprit.SkiStation.Entities.TypeAbonnement;

import java.util.List;

public interface ISkieurServices {
    Skieur addSkieur(Skieur s);

    void removeSkieur(Long id);

    Skieur updateSkieur (Skieur s);

    List<Skieur> retrieveAllSkieurs ();

    Skieur retrieveSkieur (Long id);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

    Skieur assignSkierToAbonnement(Long numSkieur, Long numAbon);

   // Skieur addSkierAndAssignToCourse(Skieur skieur, Long numInscription, Long numCours);

    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);


}
