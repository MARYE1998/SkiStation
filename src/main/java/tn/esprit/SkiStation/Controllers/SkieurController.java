package tn.esprit.SkiStation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SkiStation.Entities.Skieur;
import tn.esprit.SkiStation.Services.ISkieurServices;

import java.util.List;


    @RestController
    @AllArgsConstructor
    @RequestMapping("/skieur")
    public class SkieurController {
        private ISkieurServices iSkieurServices;

        @PostMapping("/add")
        Skieur addSkieur(@RequestBody Skieur skieur)
        {
            return iSkieurServices.addSkieur(skieur);

        }
        @PutMapping("/update/{id}")
        Skieur updateSkieur(@RequestBody Skieur skieur)
        {
            return iSkieurServices.updateSkieur(skieur);

        }

        @GetMapping("/get/{id}")
        Skieur getSkieur(@PathVariable("id")Long id){
            return iSkieurServices.retrieveSkieur(id);
        }
        @GetMapping("/all")
        List<Skieur> getAllSkieur(){

            return iSkieurServices.retrieveAllSkieurs();
        }
        @DeleteMapping("/delete/{id}")
        void deleteSkieur(@PathVariable("id") Long id)
        {
            iSkieurServices.removeSkieur(id);
        }



    }
