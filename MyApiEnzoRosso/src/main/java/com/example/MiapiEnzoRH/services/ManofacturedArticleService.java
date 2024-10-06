package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.ManofacturedArticle;
import com.example.MiapiEnzoRH.entities.SupplyItem;
import com.example.MiapiEnzoRH.repositories.ManofacturedArticleRepository;
import com.example.MiapiEnzoRH.repositories.SupplyItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManofacturedArticleService extends BaseService<ManofacturedArticle, Long>{

    @Autowired
    private SupplyItemRepository supplyItemRepository;

    public ManofacturedArticleService(ManofacturedArticleRepository manofacturedArticleRepository) {
        super(manofacturedArticleRepository);
    }

    @Transactional
    public List<SupplyItem> listForCategories(Long idCategory) throws Exception {
        try{
            return supplyItemRepository.findAllByCategoryId(idCategory);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
