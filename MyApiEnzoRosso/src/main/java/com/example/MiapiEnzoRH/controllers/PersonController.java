package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Person;
import com.example.MiapiEnzoRH.services.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Person")
public class PersonController extends BaseController<Person, Long> {
    public PersonController(PersonService personService) {
        super(personService);
    }
}

