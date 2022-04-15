package com.example.corsojava.repository;

import com.example.corsojava.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentCustomRepositoryImpl implements StudentCustomRepository{

    @Override
    public Student findByIdAndName(String id, String name) {
        return null;
    }

}
