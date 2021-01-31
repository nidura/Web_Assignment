package com.swlc.gadget.controller;

import com.swlc.gadget.dto.Order;
import com.swlc.gadget.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/gadget-mart/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }

    @GetMapping("/history/{user_id}")
    public Order getOrderHistory(@PathVariable(name = "user_id") int id){
        return orderService.getOrderHistory(id);
    }

    @PutMapping("/cancel/{id}")
    public Boolean cancelOrder(@PathVariable(name = "id") int orderId){
        return orderService.cancelOrder(orderId);
    }

}
