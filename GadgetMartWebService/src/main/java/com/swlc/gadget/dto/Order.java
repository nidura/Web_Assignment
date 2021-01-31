package com.swlc.gadget.dto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "order_date")
    private LocalDate orderDate;
    @Column(name = "order_amount")
    private String orderAmount;
    @Column(name = "order_status")
    private String orderStatus;
    @Transient
    private String itemCode;
    @Transient
    private String itemName;
    @Transient
    private String qty;
    @Transient
    private String unitPrice;



    public Order() {
    }

    public int getId() {
        return id;
    }

    public Order setId(int id) {
        this.id = id;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public Order setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Order setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public Order setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public Order setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public Order setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public String getQty() {
        return qty;
    }

    public Order setQty(String qty) {
        this.qty = qty;
        return this;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public Order setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public Order setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
}
