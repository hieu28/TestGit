package com.example.controller;

import com.example.entity.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;

    @GetMapping("/department")
    public List<Department> getAll() {
        return departmentService.getAll();
    }

    @GetMapping("/department/{id}")
    public Optional<Department> getById(@PathVariable("id") Long id) {
        return departmentService.findById(id);
    }

    @PostMapping("/department")
    public Department createDepartment(@Validated @RequestBody Department department) {
        return departmentService.save(department); }

    @PutMapping("/department/{id}")
    public void updateDepartment(@PathVariable Long id, @RequestBody Department department) {
        departmentService.updateDepartment(id, department);
    }

    @DeleteMapping("/department/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
    }
}



