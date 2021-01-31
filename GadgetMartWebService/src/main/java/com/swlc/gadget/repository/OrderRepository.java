package com.swlc.gadget.repository;

import com.swlc.gadget.dto.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
    Order findByUserId(int id);
}
