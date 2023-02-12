package tn.esprit.SkiStation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SkiStation.Entities.Skieur;
import tn.esprit.SkiStation.Repositories.PisteRepo;
import tn.esprit.SkiStation.Repositories.SkieurRepo;

import java.util.List;
@AllArgsConstructor
@Service
public class SkieurServicesImpl implements ISkieurServices{
    private SkieurRepo skieurRepo;
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
        return skieurRepo.findAll() ;
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepo.findById(numSkieur).orElse(null);
    }
}
