package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Abonnement;
import tn.esprit.SkiStation.Entities.Skieur;
import tn.esprit.SkiStation.Entities.TypeAbonnement;
import tn.esprit.SkiStation.Repositories.SkieurRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementServices {

    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Abonnement retrieveAbonnement(Long numAbonnement);
    void remove(Long id);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);

    Set<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate,

                                                 LocalDate endDate);

    }




