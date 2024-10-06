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
@RequestMapping("/manofacturedArticleDetails")
public class ManofacturedArticleDetailsController extends BaseController<ManofacturedArticleDetails, Long> {

    @Autowired
    private ManofacturedArticleDetailsService manofacturedArticleDetailsService;

    public ManofacturedArticleDetailsController(ManofacturedArticleDetailsService service) {
        super(service);
    }

    @GetMapping("/SupplyItem/{supplyItemId}")
    public ResponseEntity<List<ManofacturedArticleDetails>> findBySupplyItemId(@PathVariable Long supplyItemId) throws Exception {
        List<ManofacturedArticleDetails> details = manofacturedArticleDetailsService.findAllBySupplyItemId(supplyItemId);
        return ResponseEntity.ok(details);
    }

    @GetMapping("/ManofacturedArticle/{manofacturedArticleId}")
    public ResponseEntity<List<ManofacturedArticleDetails>> findByManofacturedArticleId(@PathVariable Long manofacturedArticleId) throws Exception {
        List<ManofacturedArticleDetails> details = manofacturedArticleDetailsService.findAllByManofacturedArticleId(manofacturedArticleId);
        return ResponseEntity.ok(details);
    }
}