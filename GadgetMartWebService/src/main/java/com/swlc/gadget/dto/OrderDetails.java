package com.swlc.gadget.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    private int id;
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "item_code")
    private String itemCode;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "qty")
    private String qty;
    @Column(name = "unit_price")
    private String unitPrice;

    public OrderDetails() {
    }

    public int getId() {
        return id;
    }

    public OrderDetails setId(int id) {
        this.id = id;
        return this;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderDetails setOrderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public OrderDetails setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public OrderDetails setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public String getQty() {
        return qty;
    }

    public OrderDetails setQty(String qty) {
        this.qty = qty;
        return this;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public OrderDetails setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
}
