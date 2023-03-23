package tn.esprit.SkiStation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SkiStation.Entities.Skieur;
import tn.esprit.SkiStation.Entities.TypeAbonnement;
import tn.esprit.SkiStation.Services.ISkieurServices;

import java.util.List;


    @RestController
    @AllArgsConstructor
    @RequestMapping("/skieur")
    public class SkieurController {

        private ISkieurServices iSkieurServices;

        @PostMapping("/add")
        Skieur addSkieur(@RequestBody Skieur skieur) {
            return iSkieurServices.addSkieur(skieur);

        }

        @PutMapping("/update/{id}")
        Skieur updateSkieur(@RequestBody Skieur skieur) {
            return iSkieurServices.updateSkieur(skieur);

        }

        @GetMapping("/get/{id}")
        Skieur getSkieur(@PathVariable("id") Long id) {
            return iSkieurServices.retrieveSkieur(id);
        }

        @GetMapping("/all")
        List<Skieur> getAllSkieur() {

            return iSkieurServices.retrieveAllSkieurs();
        }

        @DeleteMapping("/delete/{id}")
        void deleteSkieur(@PathVariable("id") Long id) {
            iSkieurServices.removeSkieur(id);
        }

        @PutMapping("/{numSkieur}/{numPiste}")
        Skieur assignSkierToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste) {
            return iSkieurServices.assignSkierToPiste(numSkieur, numPiste);
        }

        @PutMapping("/rest/{numSkieur}/{numAbon}")
        Skieur assignSkierToAbonnement(@PathVariable Long numSkieur, @PathVariable Long numAbon) {
            return iSkieurServices.assignSkierToAbonnement(numSkieur, numAbon);
        }
       // @PutMapping("/addStudent/{numInscription}/{numCours}")
       //  Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur,@PathVariable Long numInscription,@PathVariable Long numCours){
//
       //     return iSkieurServices.addSkierAndAssignToCourse(skieur,numInscription,numCours);
       // }
       //

     //  Skieur retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement){
     //      return  iSkieurServices.retrieveSkieur(typeAbonnement);
     //
     //  }
     //
        @GetMapping("/skibysub/{typeAbonnement}")
        public List<Skieur> retrieveSkiersBySubscriptionType(@PathVariable TypeAbonnement typeAbonnement)
        {
            return  iSkieurServices.retrieveSkiersBySubscriptionType(typeAbonnement);
        }
    }





