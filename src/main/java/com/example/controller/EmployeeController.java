package com.example.controller;

import com.example.model.entity.Employee;
import com.example.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImplement;

    @GetMapping("/employee")
    public List<Employee> getAll() {
        return employeeServiceImplement.getAll();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getById(@PathVariable("id") Long id) {
        return employeeServiceImplement.findById(id);
    }

    @PostMapping("/employee")
    public Employee createAccount(@Validated @RequestBody Employee employee) {
        return employeeServiceImplement.save(employee); }

    @PutMapping("/employee/{id}")
    public void updateAccount(@PathVariable Long id, @RequestBody Employee employee) {
        employeeServiceImplement.updateEmployee(id, employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteAccount(@PathVariable Long id) {
        employeeServiceImplement.deleteEmployee(id);
    }
}