package tn.esprit.SkiStation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.SkiStation.Entities.Abonnement;
import tn.esprit.SkiStation.Entities.Skieur;
import tn.esprit.SkiStation.Entities.TypeAbonnement;
import tn.esprit.SkiStation.Repositories.AbonnementRepo;
import tn.esprit.SkiStation.Repositories.SkieurRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class AbonnementServicesImpl implements IAbonnementServices{
    private AbonnementRepo abonnementRepo;
    private final SkieurRepo skieurRepo;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepo.findAll() ;
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbonnement) {
        return abonnementRepo.findById(numAbonnement).orElse(null);
    }

    @Override
    public void remove(Long id) {
        abonnementRepo.deleteById(id);

    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
       return abonnementRepo.findByTypeAbonnement(type);
    }

    @Override
    public Set<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        //return getAll().stream().filter(abonnement -> abonnement.getDateDebut().isBefore(endDate) && abonnement.getDateDebut().isAfter(startDate)).collect(Collectors.toList());
        return abonnementRepo.findByDateDebutBetween(startDate,endDate);
    }


}
