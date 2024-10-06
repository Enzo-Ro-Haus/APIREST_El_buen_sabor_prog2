package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Company")
public class CompanyController extends BaseController<Company, Long> {
    public CompanyController(CompanyService service) {
        super(service);
    }
}