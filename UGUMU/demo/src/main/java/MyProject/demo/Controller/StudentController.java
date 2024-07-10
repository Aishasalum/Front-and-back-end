package MyProject.demo.Controller;

import MyProject.demo.Model.Student;
import MyProject.demo.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    public StudentServices studentServices;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentServices.createStudent(student);
    }
    @GetMapping("/all")
    public List<Student> findAll(){
        return studentServices.findAll();
    }
    @GetMapping("{stId}")
    public Optional<Student> findById(@PathVariable Integer stId){
        return studentServices.findById(stId);
    }
    @DeleteMapping("{stId}")
    public void deleteStudent(@PathVariable Integer stId){
        studentServices.deleteStudent(stId);
    }
    @PutMapping("{stId}")
    public Student updateStudent(@RequestBody Student student,@PathVariable Integer stId){
        student.setStId(stId);
        return studentServices.createStudent(student);
    }
}
