package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Address;
import com.example.MiapiEnzoRH.repositories.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService extends BaseService<Address, Long>{

    @Autowired
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        super(addressRepository);
    }

    @Transactional
    public List<Address> listByArea(Long idArea) throws Exception {
        try {
            return addressRepository.findAllByAreaId(idArea);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Address> listByProvince(Long idProvince) throws Exception {
        try {
            return addressRepository.findAllByAreaId(idProvince);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
    @Transactional
    public List<Address> listByCountry(Long idCountry) throws Exception {
        try {
            return addressRepository.findAllByAreaId(idCountry);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
    @Transactional
    public List<Address> listByClient(Long idClient) throws Exception {
        try {
            return addressRepository.findAllByAreaId(idClient);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

}
