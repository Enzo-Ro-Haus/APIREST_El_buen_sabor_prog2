package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Area;
import com.example.MiapiEnzoRH.services.AreaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Area")
public class AreaController extends BaseController<Area, Long>{
    public AreaController(AreaService service) {
        super(service);
    }
}
