package com.jsm.api.service;

import com.jsm.api.model.Student;
import com.jsm.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addNewStudent(Student request){

        Student student = new Student();
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setFatherName(request.getFatherName());
        student.setMotherName(request.getMotherName());
        student.setDob(request.getDob());
        student.setGender(request.getGender());
        student.setAddress(request.getAddress());
        student.setCaste(request.getCaste());
        student.setCategory(request.getCategory());
        student.setContactNumber(request.getContactNumber());

        studentRepository.save(student);
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
}
