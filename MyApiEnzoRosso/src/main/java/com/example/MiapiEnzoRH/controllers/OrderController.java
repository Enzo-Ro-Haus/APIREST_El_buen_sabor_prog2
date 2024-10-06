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
@RequestMapping("/Order")
public class OrderController extends BaseController<Order, Long> {

    @Autowired
    private OrderService orderService;

    public OrderController(OrderService service) {
        super(service);
    }

    @GetMapping("/Client/{clientId}")
    public ResponseEntity<List<Order>> findByClientId(@PathVariable Long clientId) throws Exception {
        List<Order> orders = orderService.findAllByClientId(clientId);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/Employee/{employeeId}")
    public ResponseEntity<List<Order>> findByEmployeeId(@PathVariable Long employeeId) throws Exception {
        List<Order> orders = orderService.findAllByEmployeeId(employeeId);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/Branch/{branchId}")
    public ResponseEntity<List<Order>> findByBranchId(@PathVariable Long branchId) throws Exception {
        List<Order> orders = orderService.findAllByBranchId(branchId);
        return ResponseEntity.ok(orders);
    }
}
