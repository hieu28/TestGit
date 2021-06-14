package com.example.service;


import com.example.model.entity.Department;
import com.example.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DepartmentService {

    @Autowired
    DepartmentRepo departmentRepo;

    public Optional<Department> findById(long id) {

        return departmentRepo.findById(id);
    }


    public Department save(Department department) {

        return (Department) departmentRepo.save(department);
    }

    public List<Department> getAll() {
        List<Department> department = new ArrayList<Department>();
        departmentRepo.findAll().forEach(department::add);
        return department;
    }

    public void updateDepartment(Long id, Department department) {
        departmentRepo.save(department);

    }

    public void deleteDepartment(Long id) {
        departmentRepo.deleteById(id);
    }



}
