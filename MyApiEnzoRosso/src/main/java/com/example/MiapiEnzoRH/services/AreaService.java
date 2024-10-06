package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Area;
import com.example.MiapiEnzoRH.repositories.AreaRepository;
import org.springframework.stereotype.Service;

@Service
public class AreaService extends BaseService<Area, Long>{
    public AreaService(AreaRepository areaRepository) {
        super(areaRepository);
    }
}
