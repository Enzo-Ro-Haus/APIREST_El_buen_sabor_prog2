package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.OrderDetails;
import com.example.MiapiEnzoRH.repositories.OrderDetailsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsService extends BaseService<OrderDetails, Long> {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsService(OrderDetailsRepository orderDetailsRepository) {
        super(orderDetailsRepository);
    }

    @Transactional
    public List<OrderDetails> listForOrder(Long idOrder) throws Exception {
        try {
            return orderDetailsRepository.findByOrderId(idOrder);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
