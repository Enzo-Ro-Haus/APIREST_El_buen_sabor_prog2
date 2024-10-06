package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Branch;
import com.example.MiapiEnzoRH.repositories.BranchRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService extends BaseService<Branch, Long>{

    @Autowired
    private BranchRepository branchRepository;

    public BranchService(BranchRepository branchRepository) {
        super(branchRepository);
    }

    @Transactional
    public List<Branch> findAllByCompanyId(Long companyId) throws Exception {
        try {
            return branchRepository.findAllByCompany(companyId);
        } catch (Exception e) {
            throw new Exception("Failed to find branches for company with ID: " + companyId, e);
        }
    }
}
