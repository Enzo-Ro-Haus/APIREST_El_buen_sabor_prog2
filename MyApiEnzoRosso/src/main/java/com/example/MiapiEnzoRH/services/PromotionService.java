package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Promotion;
import com.example.MiapiEnzoRH.repositories.PromotionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService extends BaseService<Promotion, Long> {

    @Autowired
    private PromotionRepository promotionRepository;

    public PromotionService(PromotionRepository promotionRepository) {
        super(promotionRepository);
    }

    @Transactional
    public List<Promotion> findAllByBranchId(Long branchId) throws Exception {
        try {
            return promotionRepository.findAllByBranch(branchId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
