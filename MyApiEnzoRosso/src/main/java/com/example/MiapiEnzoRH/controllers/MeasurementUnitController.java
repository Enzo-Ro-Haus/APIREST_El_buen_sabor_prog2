package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.MeasurementUnit;
import com.example.MiapiEnzoRH.services.MeasurementUnitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MeasurementUnit")
public class MeasurementUnitController extends BaseController<MeasurementUnit, Long> {
    public MeasurementUnitController(MeasurementUnitService service) {
        super(service);
    }
}