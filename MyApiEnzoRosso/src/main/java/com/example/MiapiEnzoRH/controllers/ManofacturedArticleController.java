package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manofacturedArticle")
public class ManofacturedArticleController extends BaseController<ManofacturedArticle, Long> {

    @Autowired
    private SupplyItemService supplyItemService;

    public ManofacturedArticleController(ManofacturedArticleService service) {
        super(service);
    }

    @GetMapping("/Category/{id}")
    public ResponseEntity<List<SupplyItem>> listForCategory(@PathVariable Long id) throws Exception {
        List<SupplyItem> supplyItems = supplyItemService.listForCategories(id);
        return ResponseEntity.ok(supplyItems);
    }
}