package com.example.MiapiEnzoRH.repositories;


import com.example.MiapiEnzoRH.entities.Bill;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BillRepository extends BaseRepository<Bill, Long> {
    List<Bill> findAllByOrderId(Long orderId);
}
