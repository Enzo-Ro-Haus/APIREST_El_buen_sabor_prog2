package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.SupplyItem;
import com.example.MiapiEnzoRH.repositories.SupplyItemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyItemService extends BaseService<SupplyItem, Long> {
    @Autowired
    private SupplyItemRepository supplyItemRepository;

    public SupplyItemService(SupplyItemRepository supplyItemRepository){
        super(supplyItemRepository);
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
