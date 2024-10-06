package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Category;
import com.example.MiapiEnzoRH.repositories.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends BaseService<Category, Long>{

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        super(categoryRepository);
    }

    @Transactional
    public List<Category> findAllByFatherCategoryId(Long fatherCategoryId) throws Exception {
        try {
            return categoryRepository.findAllByFatherCategory(fatherCategoryId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Category> findAllByBranchId(Long branchId) throws Exception {
        try {
            return categoryRepository.findAllByBranch(branchId);
        } catch (Exception e) {
            throw new Exception("Failed to find categories by branchId: " + branchId, e);
        }
    }
}
