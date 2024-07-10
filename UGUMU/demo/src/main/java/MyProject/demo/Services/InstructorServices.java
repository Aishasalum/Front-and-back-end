package MyProject.demo.Services;

import MyProject.demo.Model.Instructor;
import MyProject.demo.Repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class InstructorServices {
    @Autowired
    public InstructorRepository instructorRepository;

    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }

    public Optional<Instructor> findById(Integer instructor_id) {
        return instructorRepository.findById(instructor_id);
    }

    public void deleteInstructor(Integer instructor_id) {
        instructorRepository.deleteById(instructor_id);
    }
}
