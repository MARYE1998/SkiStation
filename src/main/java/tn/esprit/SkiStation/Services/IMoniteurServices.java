package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Moniteur;

import java.util.List;

public interface IMoniteurServices {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    void remove(Long id);
}