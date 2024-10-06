package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {

}
