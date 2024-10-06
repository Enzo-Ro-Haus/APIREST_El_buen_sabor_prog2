package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.ManofacturedArticle;
import com.example.MiapiEnzoRH.entities.SupplyItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManofacturedArticleRepository extends BaseRepository<ManofacturedArticle, Long>{

    List<SupplyItem> findAllByCategoryId(Long idCategory);
}
