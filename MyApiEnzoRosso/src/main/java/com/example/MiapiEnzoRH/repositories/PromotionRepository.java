package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.Promotion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends BaseRepository<Promotion, Long>{
    List<Promotion> findAllByBranch(Long branchId);
}
