package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends BaseRepository<Category, Long>{
    List<Category> findAllByFatherCategory(Long fatherCategoryId);
    List<Category> findAllByBranch(Long branchId);
}

