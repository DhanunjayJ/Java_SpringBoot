package com.dj.springjdbcdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.dj.springjdbcdemo.Model.Student;
import com.dj.springjdbcdemo.repository.StudentRepo;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepo repository;
    
    public StudentRepo getRepository() {
        return repository;
    }

    
    public void setRepository(StudentRepo repository) {
        this.repository = repository;
    }

    public void addStudent(Student s) {
        repository.save(s);
    }

    public List<Student> getStudents() {
      return repository.findAll();
    }
    
}
