package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Category;
import com.example.MiapiEnzoRH.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class CategoryController extends BaseController<Category, Long>{

    @Autowired
    private CategoryService categoryService;

    public CategoryController(CategoryService service) {
        super(service);
    }

    @GetMapping("/FatherCategory/{id}")
    public ResponseEntity<List<Category>> findByFatherCategoryId(@PathVariable Long id) throws Exception {
        List<Category> categories = categoryService.findAllByFatherCategoryId(id);
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/Branch/{id}")
    public ResponseEntity<List<Category>> findByBranchId(@PathVariable Long id) throws Exception {
        List<Category> categories = categoryService.findAllByBranchId(id);
        return ResponseEntity.ok(categories);
    }
}