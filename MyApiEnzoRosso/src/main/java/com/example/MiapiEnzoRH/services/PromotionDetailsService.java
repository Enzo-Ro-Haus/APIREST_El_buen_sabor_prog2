package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.PromotionDetails;
import com.example.MiapiEnzoRH.repositories.PromotionsDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class PromotionDetailsService extends BaseService<PromotionDetails, Long> {
    public PromotionDetailsService(PromotionsDetailsRepository promotionDeteailsRepository) {
        super(promotionDeteailsRepository);
    }
}
