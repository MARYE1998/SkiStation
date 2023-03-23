package tn.esprit.SkiStation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SkiStation.Entities.Inscription;
import tn.esprit.SkiStation.Repositories.InscriptionRepo;

import java.util.List;
@AllArgsConstructor
@Service
public class InscriptionServicesImpl implements IInscriptionServices{
    private InscriptionRepo inscriptionRepo;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepo.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepo.findById(numInscription).orElse(null);
    }

    @Override
    public void remove(Long id) {
        inscriptionRepo.deleteById(id);

    }
}
