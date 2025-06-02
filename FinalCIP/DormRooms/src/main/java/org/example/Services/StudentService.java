package org.example.Services;


import org.example.Model.Student;
import org.example.Repository.DataRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    public String addStudent(Student student) {
        DataRepository.students.put(student.getId(), student);
        return "Student added.";
    }

    public Collection<Student> getAllStudents() {
        return DataRepository.students.values();
    }
}
