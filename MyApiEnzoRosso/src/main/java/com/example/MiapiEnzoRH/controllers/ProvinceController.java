package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Province")
public class ProvinceController extends BaseController<Province, Long> {
    public ProvinceController(ProvinceService service) {
        super(service);
    }
}