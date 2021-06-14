package com.example.service;

import com.example.model.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Optional<Employee> findById(Long id);

    public Employee save(Employee account);

    public List<Employee> getAll();

    public void updateEmployee(Long id, Employee employee);

    public void deleteEmployee(Long id);
}
