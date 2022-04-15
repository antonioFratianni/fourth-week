package com.example.corsojava.service;

import com.example.corsojava.domain.Department;
import com.example.corsojava.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DepartmentService {

    @Autowired
    DepartmentRepository repository;

    public Department findByIdAndName(String id, String name) {
        Department departments = (Department) repository.findByIdAndName(id,name);
        return departments;
    }

}
