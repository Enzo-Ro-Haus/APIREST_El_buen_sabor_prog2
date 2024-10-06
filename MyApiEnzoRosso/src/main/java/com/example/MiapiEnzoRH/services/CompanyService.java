package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Company;
import com.example.MiapiEnzoRH.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends BaseService<Company, Long>{
    public CompanyService(CompanyRepository companyRepository) {
        super(companyRepository);
    }
}
