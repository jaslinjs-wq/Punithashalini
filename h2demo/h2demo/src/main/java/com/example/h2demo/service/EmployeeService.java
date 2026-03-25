package com.example.h2demo.service;

import com.example.h2demo.model.Employee;
import com.example.h2demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee emp) {
        return repository.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}