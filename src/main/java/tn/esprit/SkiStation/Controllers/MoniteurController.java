package tn.esprit.SkiStation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SkiStation.Entities.Inscription;
import tn.esprit.SkiStation.Entities.Moniteur;
import tn.esprit.SkiStation.Services.IInscriptionServices;
import tn.esprit.SkiStation.Services.IMoniteurServices;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/moniteur")
public class MoniteurController {
    private IMoniteurServices iMoniteurServices;

    @PostMapping("/add")
    Moniteur addMoniteur(@RequestBody Moniteur moniteur)
    {
        return iMoniteurServices.addMoniteur(moniteur);

    }
    @PutMapping("/update/{id}")
    Moniteur updateMoniteur(@RequestBody Moniteur moniteur)
    {
        return iMoniteurServices.updateMoniteur(moniteur);

    }

    @GetMapping("/get/{id}")
    Moniteur getMoniteur(@PathVariable("id")Long id){
        return iMoniteurServices.retrieveMoniteur(id);
    }
    @GetMapping("/all")
    List<Moniteur> getAllMoniteur(){

        return iMoniteurServices.retrieveAllMoniteurs();
    }
    @DeleteMapping("/delete/{id}")
    void deleteMoniteur(@PathVariable("id") Long id)
    {
        iMoniteurServices.remove(id);
    }


}