package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SupplyItem")
public class SupplyItemController extends BaseController<SupplyItem, Long> {
    @Autowired
    private SupplyItemService supplyItemService;

    public SupplyItemController(SupplyItemService service) {
        super(service);
    }

    @GetMapping("/Category/{id}")
    public ResponseEntity<List<SupplyItem>> listForCategory(@PathVariable Long id) throws Exception {
        List<SupplyItem> supplyItems = supplyItemService.listForCategories(id);
        return ResponseEntity.ok(supplyItems);
    }
}