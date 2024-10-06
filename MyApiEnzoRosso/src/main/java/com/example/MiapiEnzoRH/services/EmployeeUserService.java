package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.EmployeeUser;
import com.example.MiapiEnzoRH.repositories.EmployeeUserRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeUserService extends BaseService<EmployeeUser, Long>{
    public EmployeeUserService(EmployeeUserRepository employeeUserRepository) {
        super(employeeUserRepository);
    }
}
