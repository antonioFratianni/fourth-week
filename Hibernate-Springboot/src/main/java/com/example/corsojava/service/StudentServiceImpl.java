package com.example.corsojava.service;

import com.example.corsojava.domain.Student;
import com.example.corsojava.repository.StudentCustomRepository;
import com.example.corsojava.repository.StudentCustomRepositoryImpl;
import com.example.corsojava.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentCustomRepositoryImpl studentCustomRepository;

    @Override
    public Optional<Student> findById(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        studentRepository.deleteById(id);

    }

    @Override
    public Optional<Student> findByIdAndName(String id, String name) {
           Student student = studentCustomRepository.findByIdAndName(id,name);
           return Optional.ofNullable(student);
    }
}
