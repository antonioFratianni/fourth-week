package com.example.corsojava.controller;

import com.example.corsojava.domain.Student;
import com.example.corsojava.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(path = "/{id}")
    ResponseEntity<?> findById(@PathVariable String id){
        Optional<Student> student = studentService.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping(path = "/findall")
    ResponseEntity<?> findAll(){
        List<Student> student = studentService.findAll();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    ResponseEntity<?> deleteById(@PathVariable String id){
        studentService.findById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
