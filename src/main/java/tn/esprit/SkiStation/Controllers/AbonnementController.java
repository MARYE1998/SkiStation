package tn.esprit.SkiStation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SkiStation.Entities.Abonnement;
import tn.esprit.SkiStation.Services.IAbonnementServices;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/abonnement")
public class AbonnementController {
    private IAbonnementServices iAbonnementServices;

    @PostMapping("/add")
    Abonnement addAbonnement(@RequestBody Abonnement abonnement)
     {
         return iAbonnementServices.addAbonnement(abonnement);

     }
     @PutMapping("/update/{id}")
      Abonnement updateAbonnement(@RequestBody Abonnement abonnement)
     {
         return iAbonnementServices.updateAbonnement(abonnement);

     }

     @GetMapping("/get/{id}")
    Abonnement getAbonnement(@PathVariable("id")Long id){
         return iAbonnementServices.retrieveAbonnement(id);
     }
     @GetMapping("/all")
    List<Abonnement> getAllAbonnements(){

         return iAbonnementServices.retrieveAllAbonnements();
     }
     @DeleteMapping("/delete/{id}")
    void deleteAbonneement(@PathVariable("id") Long id)
     {
         iAbonnementServices.remove(id);
     }


}
