package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Country")
public class CountryController extends BaseController<Country, Long> {
    public CountryController(CountryService service) {
        super(service);
    }
}