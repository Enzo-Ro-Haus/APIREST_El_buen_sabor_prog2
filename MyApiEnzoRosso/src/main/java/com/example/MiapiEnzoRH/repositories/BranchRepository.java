package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.Branch;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends BaseRepository<Branch, Long>{
    List<Branch> findAllByCompany(Long companyId);
}
