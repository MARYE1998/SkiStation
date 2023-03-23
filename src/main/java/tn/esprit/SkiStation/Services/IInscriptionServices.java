package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Inscription;

import java.util.List;

public interface IInscriptionServices {
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscription (Long numInscription);
    void remove(Long id);
}
