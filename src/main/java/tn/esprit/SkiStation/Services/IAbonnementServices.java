package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Abonnement;

import java.util.List;

public interface IAbonnementServices {

    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Abonnement retrieveAbonnement(Long numAbonnement);
    void remove(Long id);
}

