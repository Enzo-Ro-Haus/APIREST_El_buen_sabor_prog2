package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Country;
import com.example.MiapiEnzoRH.repositories.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseService<Country, Long>{
    public CountryService(CountryRepository countryRepository) {
        super(countryRepository);
    }
}
