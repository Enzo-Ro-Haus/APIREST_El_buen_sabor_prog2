package com.example.MiapiEnzoRH.repositories;

import com.example.MiapiEnzoRH.entities.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends BaseRepository<Order, Long>{

    List<Order> findAllByClientId(Long clientId);

    List<Order> findAllByEmployeeId(Long employeeId);

    List<Order> findAllByBranchId(Long branchId);
}
