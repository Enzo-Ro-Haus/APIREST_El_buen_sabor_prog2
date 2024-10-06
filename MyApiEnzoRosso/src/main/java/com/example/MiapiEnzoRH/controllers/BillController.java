package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Bill;
import com.example.MiapiEnzoRH.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Bill")
public class BillController extends BaseController<Bill, Long>{

    @Autowired
    private BillService billService;

    public BillController(BillService service) {
        super(service);
    }


    @GetMapping("/Order/{id}")
    public ResponseEntity<List<Bill>> findByOrderId(@PathVariable Long id) throws Exception {
        List<Bill> bills = billService.findAllByOrderId(id);
        return ResponseEntity.ok(bills);
    }
}
