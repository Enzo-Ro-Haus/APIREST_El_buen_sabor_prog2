package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeController extends BaseController<Employee, Long> {

    @Autowired
    public EmployeeService employeeService;

    public EmployeeController(EmployeeService service) {
        super(service);
    }

    @GetMapping("/Branch/{id}")
    public ResponseEntity<List<Employee>> listByBranch(@PathVariable Long id) throws Exception {
        List<Employee> employeesList = employeeService.listByBranch(id);
        return ResponseEntity.ok(employeesList);
    }
}