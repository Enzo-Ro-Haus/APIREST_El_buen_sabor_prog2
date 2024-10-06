package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.SupplyItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplyItemRepository extends BaseRepository<SupplyItem, Long>{

    List<SupplyItem> findAllByCategoryId(Long idCategory);
}
