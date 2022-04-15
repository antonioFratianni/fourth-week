package com.example.corsojava.repository;

import com.example.corsojava.domain.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, String> {

    List<Department> findByIdAndName(String id, String name);

}
