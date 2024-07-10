package MyProject.demo.Controller;

import MyProject.demo.Model.Instructor;
import MyProject.demo.Services.InstructorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/instructor")

public class InstructorController {
    @Autowired
    public InstructorServices instructorServices;

    @PostMapping
    public Instructor addInstructor(@RequestBody Instructor instructor){
        return instructorServices.createInstructor(instructor);
    }
   @GetMapping
    public List<Instructor> findAll(){
       return instructorServices.findAll();
   }
    @GetMapping("{instructor_Id}")
    public Optional<Instructor> findById(@PathVariable Integer instructor_Id){
        return instructorServices.findById(instructor_Id);
    }
    @DeleteMapping("{instructor_Id}")
    public void deleteInstructor(@PathVariable Integer instructor_Id){
        instructorServices.deleteInstructor(instructor_Id);
    }
    @PutMapping("{instructor_Id}")
    public Instructor updateInstructor(@RequestBody Instructor instructor,@PathVariable Integer instructor_Id){
        instructor.setInstructor_Id(instructor_Id);
        return instructorServices.createInstructor(instructor);
    }
}
