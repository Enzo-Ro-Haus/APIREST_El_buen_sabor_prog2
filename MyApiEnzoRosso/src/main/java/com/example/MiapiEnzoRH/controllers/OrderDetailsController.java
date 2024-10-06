package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/OrderDetails")
public class OrderDetailsController extends BaseController<OrderDetails, Long> {

    @Autowired
    private OrderDetailsService orderDetailsService;

    public OrderDetailsController(OrderDetailsService service) {
        super(service);
    }


    @GetMapping("/Order/{id}")
    public ResponseEntity<List<OrderDetails>> listForOrder(@PathVariable Long id) throws Exception {
        List<OrderDetails> orderDetails = orderDetailsService.listForOrder(id);
        return ResponseEntity.ok(orderDetails);
    }
}