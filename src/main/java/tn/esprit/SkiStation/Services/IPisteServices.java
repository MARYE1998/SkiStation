package tn.esprit.SkiStation.Services;

import tn.esprit.SkiStation.Entities.Piste;

import java.util.List;

public interface IPisteServices {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
    void remove(Long id);
}
