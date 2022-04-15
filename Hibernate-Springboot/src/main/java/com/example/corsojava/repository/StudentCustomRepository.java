package com.example.corsojava.repository;

import com.example.corsojava.domain.Department;
import com.example.corsojava.domain.Student;

public interface StudentCustomRepository {

    Student findByIdAndName(String id, String name);

}
