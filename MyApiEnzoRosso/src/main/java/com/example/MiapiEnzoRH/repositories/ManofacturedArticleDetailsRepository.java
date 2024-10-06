package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.ManofacturedArticleDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManofacturedArticleDetailsRepository extends BaseRepository<ManofacturedArticleDetails, Long>{
    List<ManofacturedArticleDetails> findAllBySupplyItemId(Long supplyItemId);

    List<ManofacturedArticleDetails> findAllByManofacturedArticleId(Long manofacturedArticleId);

}
