package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Address;
import com.example.MiapiEnzoRH.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Address")
public class AddressController extends BaseController<Address, Long> {

    @Autowired
    public AddressService addressService;

    public AddressController(AddressService service) {
        super(service);
    }

    @GetMapping("/Area/{id}")
    public ResponseEntity<List<Address>> listByArea(@PathVariable Long id) throws Exception {
        List<Address> addressList = addressService.listByArea(id);
        return ResponseEntity.ok(addressList);
    }

    @GetMapping("/Province/{id}")
    public ResponseEntity<List<Address>> listByProvince(@PathVariable Long id) throws Exception {
        List<Address> addressList = addressService.listByArea(id);
        return ResponseEntity.ok(addressList);
    }

    @GetMapping("/Country/{id}")
    public ResponseEntity<List<Address>> listByCountry(@PathVariable Long id) throws Exception {
        List<Address> addressList = addressService.listByArea(id);
        return ResponseEntity.ok(addressList);
    }

    @GetMapping("/Client/{id}")
    public ResponseEntity<List<Address>> listByClient(@PathVariable Long id) throws Exception {
        List<Address> addressList = addressService.listByArea(id);
        return ResponseEntity.ok(addressList);
    }
}
