package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Province;
import com.example.MiapiEnzoRH.repositories.ProvinceRepository;
import org.springframework.stereotype.Service;

@Service
public class ProvinceService extends BaseService<Province, Long>{
    public ProvinceService(ProvinceRepository provinceRepository){
        super(provinceRepository);
    }
}
