package com.swlc.gadget.repository;

import com.swlc.gadget.dto.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails,Integer> {
}
