package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends BaseRepository<Address, Long>{

    List<Address> findAllByAreaId(Long idArea);
    List<Address> findAllByProvinceId(Long idProvince);
    List<Address> findAllByCountryId(Long idCountry);
    List<Address> findAllByClientId(Long idClient);

}
