package tn.esprit.SkiStation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.SkiStation.Entities.Piste;
import tn.esprit.SkiStation.Repositories.PisteRepo;

import java.util.List;
@AllArgsConstructor
@Service
public class PisteServicesImpl implements IPisteServices{
    private PisteRepo pisteRepo;
    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepo.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepo.findById(numPiste).orElse(null);
    }

    @Override
    public void remove(Long id) {
        pisteRepo.deleteById(id);

    }
}
