package com.jsm.api.controller;

import com.dropstat.api.exception.CustomException;
import com.jsm.api.model.Student;
import com.jsm.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> addNewStudent(@RequestBody Student request) {
        if(request.getFirstName()==null) throw new CustomException("first name can't be null", HttpStatus.BAD_REQUEST);
        studentService.addNewStudent(request);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "student added successfully");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Map<String, Object>> addNewStudent(@PathVariable(value = "id") Long id) {
        if(id==null) throw new CustomException("id can't be null", HttpStatus.BAD_REQUEST);
        Map<String, Object> response = new HashMap<>();
        response.put("studentFetchedSuccessfully", studentService.getStudentById(id));
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
