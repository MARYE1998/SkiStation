package tn.esprit.SkiStation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.SkiStation.Entities.Cours;
import tn.esprit.SkiStation.Services.ICoursServices;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CoursControllers {
    private ICoursServices iCoursServices;

    @PostMapping("/add")
    Cours addCours(@RequestBody Cours cours)
    {
        return iCoursServices.addCours(cours);

    }
    @PutMapping("/update/{id}")
    Cours updateCours(@RequestBody Cours cours)
    {
        return iCoursServices.updateCours(cours);

    }

    @GetMapping("/get/{id}")
    Cours getCours(@PathVariable("id")Long id){
        return iCoursServices.retrieveCours(id);
    }
    @GetMapping("/all")
    List<Cours> getAllCours(){

        return iCoursServices.retrieveAllCourses();
    }
    @DeleteMapping("/delete/{id}")
    void deleteCours(@PathVariable("id") Long id)
    {
        iCoursServices.remove(id);
    }



}
