package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Order;
import com.example.MiapiEnzoRH.repositories.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService extends BaseService<Order, Long>{

    @Autowired
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        super(orderRepository);
    }

    @Transactional
    public List<Order> findAllByClientId(Long clientId) throws Exception {
        try {
            return orderRepository.findAllByClientId(clientId);
        } catch (Exception e) {
            throw new Exception("Failed to find orders by clientId: " + clientId, e);
        }
    }
    @Transactional
    public List<Order> findAllByEmployeeId(Long employeeId) throws Exception {
        try {
            return orderRepository.findAllByEmployeeId(employeeId);
        } catch (Exception e) {
            throw new Exception("Failed to find orders by employeeId: " + employeeId, e);
        }
    }
    @Transactional
    public List<Order> findAllByBranchId(Long branchId) throws Exception {
        try {
            return orderRepository.findAllByBranchId(branchId);
        } catch (Exception e) {
            throw new Exception("Failed to find orders by branchId: " + branchId, e);
        }
    }
}
