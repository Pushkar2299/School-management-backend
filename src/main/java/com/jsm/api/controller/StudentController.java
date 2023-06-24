package com.jsm.api.controller;

import com.jsm.api.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @PutMapping
    public ResponseEntity<?> addNewStudent(@RequestBody Student student){

    }
}
