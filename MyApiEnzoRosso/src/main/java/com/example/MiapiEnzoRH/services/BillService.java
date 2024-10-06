package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Bill;
import com.example.MiapiEnzoRH.repositories.BillRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService extends BaseService<Bill, Long>{

    @Autowired
    private BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        super(billRepository);
    }

    @Transactional
    public List<Bill> findAllByOrderId(Long orderId) throws Exception {
        try {
            return billRepository.findAllByOrderId(orderId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
