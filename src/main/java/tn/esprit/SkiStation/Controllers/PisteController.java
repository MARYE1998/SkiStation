package tn.esprit.SkiStation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SkiStation.Entities.Piste;
import tn.esprit.SkiStation.Services.IPisteServices;

import java.util.List;


    @RestController
    @AllArgsConstructor
    @RequestMapping("/piste")
    public class PisteController {
        private IPisteServices iPisteServices;

        @PostMapping("/add")
        Piste addPiste(@RequestBody Piste piste)
        {
            return iPisteServices.addPiste(piste);

        }
        @PutMapping("/update/{id}")
        Piste updatePiste(@RequestBody Piste piste)
        {
            return iPisteServices.updatePiste(piste);

        }

        @GetMapping("/get/{id}")
        Piste getPiste(@PathVariable("id")Long id){
            return iPisteServices.retrievePiste(id);
        }
        @GetMapping("/all")
        List<Piste> getAllPiste(){

            return iPisteServices.retrieveAllPistes();
        }
        @DeleteMapping("/delete/{id}")
        void deletePiste(@PathVariable("id") Long id)
        {
            iPisteServices.remove(id);
        }



    }

