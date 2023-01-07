package com.example.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.example.student.data.StudentRepository;
import com.example.student.model.Student;

@Service
public class StudentService {
    private StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }
   
    public void createStudent(Student student) {
        String hashPsw = hash(student.getPsw());
        student.setPsw(hashPsw);
        repo.save(student);
    }
    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Optional<Student> findStudent(int id) {
        return  repo.findById(id);
    }

    private String hash(String pin) {
        String salt = BCrypt.gensalt(12);
        return BCrypt.hashpw( pin, salt);
    }

    public Optional<Student> checkPsw(Student inputStudent) {

        Optional<Student> storedStudent  = findStudent(inputStudent.getId());

        if (storedStudent != null) {
            String storedPsw = storedStudent.get().getPsw();
            if (BCrypt.checkpw(inputStudent.getPsw(), storedPsw))
                return storedStudent;
        }
        return null;
    }
}
