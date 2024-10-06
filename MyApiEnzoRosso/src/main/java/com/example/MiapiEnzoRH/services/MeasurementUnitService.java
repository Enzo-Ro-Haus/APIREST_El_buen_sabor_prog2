package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.MeasurementUnit;
import com.example.MiapiEnzoRH.repositories.MeasurementUnitRepository;
import org.springframework.stereotype.Service;

@Service
public class MeasurementUnitService extends BaseService<MeasurementUnit, Long>{
    public MeasurementUnitService(MeasurementUnitRepository measurementUnitRepository) {
        super(measurementUnitRepository);
    }
}
