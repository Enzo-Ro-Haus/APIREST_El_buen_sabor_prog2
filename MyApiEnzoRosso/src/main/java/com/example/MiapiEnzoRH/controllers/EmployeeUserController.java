package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/EmployeeUser")
public class EmployeeUserController extends BaseController<EmployeeUser, Long> {
    public EmployeeUserController(EmployeeUserService service) {
        super(service);
    }
}
