package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.OrderDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsRepository extends BaseRepository<OrderDetails, Long>{

    List<OrderDetails> findByOrderId(Long orderId);

}
