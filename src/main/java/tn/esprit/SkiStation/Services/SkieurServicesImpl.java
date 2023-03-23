package tn.esprit.SkiStation.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.SkiStation.Entities.*;
import tn.esprit.SkiStation.Repositories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class SkieurServicesImpl implements ISkieurServices {


    private SkieurRepo skieurRepo;

    private final PisteRepo pisteRepo;
    private final AbonnementRepo abonnementRepo;
    private final CoursRepo coursRepo;
    private final InscriptionRepo inscriptionRepo;
    private final MoniteurRepo moniteurRepo;

    @Override
    public Skieur addSkieur(Skieur s) {
        return skieurRepo.save(s);
    }

    @Override
    public void removeSkieur(Long id) {
        skieurRepo.deleteById(id);

    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepo.save(s);
    }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepo.findAll();
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepo.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //recuperation des objets
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        //verifier si skieur not null
        Assert.notNull(skieur, "skieur not found");
        Piste piste = pisteRepo.findById(numPiste).orElse(null);
        //verifier si piste not null
        Assert.notNull(piste, "piste not found");
        //traitement n7eb nsety les objets l gdom jebtah w zedtah lgdim w ba3ed lgdim m3a jdid n7otah f ligne lekher "skieur.setPistes(pistes);"
       /* Set<Piste> pistes = skieur.getPistes();
        pistes.add(piste);
        skieur.setPistes(pistes);
        */
        skieur.getPistes().add(piste);
        //save
        return skieurRepo.save(skieur);
    }

    @Override
    public Skieur assignSkierToAbonnement(Long numSkieur, Long numAbon) {
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        Abonnement abonnement = abonnementRepo.findById(numAbon).orElse(null);
        Assert.notNull(skieur, "skieur not found");
        Assert.notNull(abonnement, "abonnement not found");
        skieur.setAbonnement(abonnement);
        return skieurRepo.save(skieur);
    }

       // @Override
       // public Skieur addSkierAndAssignToCourse(Skieur skieur,Long numInscription, Long numCours) {
       //     skieurRepo.save(skieur);
       //     Cours cours = coursRepo.findById(numCours).orElse(null);
       //     Inscription inscription = inscriptionRepo.findById(numInscription).orElse(null);
       //     Assert.notNull(cours, "Cours not found");
       //     Assert.notNull(inscription,"inscription not found");
       //     skieur.getInscriptions().add(inscription);
       //     cours.getSkieurs().add(skieur);
       //     coursRepo.save(cours);
       //     return skieurRepo.save(skieur);
       // }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {


        return skieurRepo.findByAbonnementTypeAbonnement(typeAbonnement);
    }


}

