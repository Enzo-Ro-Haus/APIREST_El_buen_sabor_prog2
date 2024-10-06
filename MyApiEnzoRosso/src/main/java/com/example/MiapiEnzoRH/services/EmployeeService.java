package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Address;
import com.example.MiapiEnzoRH.entities.Employee;
import com.example.MiapiEnzoRH.repositories.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends BaseService<Employee, Long>{

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        super(employeeRepository);
    }

    @Transactional
    public List<Employee> listByBranch(Long idBranch) throws Exception {
        try {
            return employeeRepository.listByBranchId(idBranch);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
}
