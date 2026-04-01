package com.example.h2demo.controller;

import com.example.h2demo.model.Employee;
import com.example.h2demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp) {
        return service.saveEmployee(emp);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }
}