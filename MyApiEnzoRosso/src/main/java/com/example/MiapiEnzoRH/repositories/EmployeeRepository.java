package com.example.MiapiEnzoRH.repositories;


import com.example.MiapiEnzoRH.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends BaseRepository<Employee, Long>{

    List<Employee> listByBranchId(Long idBranch);

}
