package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Promotion;
import com.example.MiapiEnzoRH.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Promotions")
public class PromotionController extends BaseController<Promotion, Long> {

    @Autowired
    private PromotionService promotionService;

    public PromotionController(PromotionService service) {
        super(service);
    }

    @GetMapping("/Branch/{id}")
    public ResponseEntity<List<Promotion>> findByBranchId(@PathVariable Long id) throws Exception {
        List<Promotion> promotions = promotionService.findAllByBranchId(id);
        return ResponseEntity.ok(promotions);
    }
}