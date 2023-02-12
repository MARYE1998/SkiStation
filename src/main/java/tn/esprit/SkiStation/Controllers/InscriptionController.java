package tn.esprit.SkiStation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SkiStation.Entities.Inscription;
import tn.esprit.SkiStation.Services.IInscriptionServices;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/inscription")
public class InscriptionController {
    private IInscriptionServices iInscriptionServices;

    @PostMapping("/add")
    Inscription addInscription(@RequestBody Inscription inscription)
    {
        return iInscriptionServices.addInscription(inscription);

    }
    @PutMapping("/update/{id}")
    Inscription updateInscription(@RequestBody Inscription inscription)
    {
        return iInscriptionServices.updateInscription(inscription);

    }

    @GetMapping("/get/{id}")
    Inscription getInscription(@PathVariable("id")Long id){
        return iInscriptionServices.retrieveInscription(id);
    }
    @GetMapping("/all")
    List<Inscription> getAllInscription(){

        return iInscriptionServices.retrieveAllInscription();
    }
    @DeleteMapping("/delete/{id}")
    void deleteInscription(@PathVariable("id") Long id)
    {
        iInscriptionServices.remove(id);
    }


}
