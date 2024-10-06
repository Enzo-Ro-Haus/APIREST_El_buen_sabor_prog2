package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.ManofacturedArticleDetails;
import com.example.MiapiEnzoRH.repositories.ManofacturedArticleDetailsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManofacturedArticleDetailsService extends BaseService<ManofacturedArticleDetails, Long>{

    @Autowired
    private ManofacturedArticleDetailsRepository manofacturedArticleDetailsRepository;

    public ManofacturedArticleDetailsService(ManofacturedArticleDetailsRepository manofacturedArticleDetailsRepository) {
        super(manofacturedArticleDetailsRepository);
    }

    @Transactional
    public List<ManofacturedArticleDetails> findAllBySupplyItemId(Long supplyItemId) throws Exception {
        try {
            return manofacturedArticleDetailsRepository.findAllBySupplyItemId(supplyItemId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ManofacturedArticleDetails> findAllByManofacturedArticleId(Long manofacturedArticleId) throws Exception {
        try {
            return manofacturedArticleDetailsRepository.findAllByManofacturedArticleId(manofacturedArticleId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
