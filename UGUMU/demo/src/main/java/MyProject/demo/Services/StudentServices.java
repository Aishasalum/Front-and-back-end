package MyProject.demo.Services;

import MyProject.demo.Model.Student;
import MyProject.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service

public class StudentServices {
    @Autowired
    public StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Integer stId) {
        return studentRepository.findById(stId);
    }

    public void deleteStudent(Integer stId) {
        studentRepository.deleteById(stId);
    }
}
