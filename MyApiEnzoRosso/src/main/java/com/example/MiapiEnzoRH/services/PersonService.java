package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Person;
import com.example.MiapiEnzoRH.repositories.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends BaseService<Person, Long> {
    public PersonService(PersonRepository personRepository){
        super(personRepository);
    }

}
