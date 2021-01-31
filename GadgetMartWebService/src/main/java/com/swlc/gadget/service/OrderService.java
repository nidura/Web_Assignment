package com.swlc.gadget.service;

import com.swlc.gadget.dto.Order;
import com.swlc.gadget.dto.OrderDetails;
import com.swlc.gadget.repository.OrderDetailRepository;
import com.swlc.gadget.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public Order saveOrder(Order order) {
        Order save = orderRepository.save(order);

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setItemCode(order.getItemCode());
        orderDetails.setItemName(order.getItemName());
        orderDetails.setQty(order.getQty());
        orderDetails.setUnitPrice(order.getUnitPrice());
        orderDetails.setOrderId(save.getId());
        orderDetailRepository.save(orderDetails);
        return save;
    }

    public Order getOrderHistory(int id) {
        return orderRepository.findByUserId(id);
    }

    public Boolean cancelOrder(int orderId) {
        Optional<Order> byId = orderRepository.findById(orderId);
        if (byId.isPresent()) {
            byId.get().setOrderStatus("DEACTIVATED");
            orderRepository.save(byId.get());
            return true;
        }
        return false;
    }
}
