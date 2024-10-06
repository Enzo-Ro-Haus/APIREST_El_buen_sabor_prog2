package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promotionDetails")
public class PromotionDetailsController extends BaseController<PromotionDetails, Long> {
    public PromotionDetailsController(PromotionDetailsService service) {
        super(service);
    }
}
