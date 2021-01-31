package com.swlc.softlogic.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

    @Id
    private int id;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "brand")
    private String brand;
    @Column(name = "unit_price")
    private String unitPrice;
    @Column(name = "logo_url")
    private String logo_url;
    @Column(name = "color")
    private String color;

    public Item() {
    }

    public int getId() {
        return id;
    }

    public Item setId(int id) {
        this.id = id;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public Item setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Item setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public Item setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public Item setLogo_url(String logo_url) {
        this.logo_url = logo_url;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Item setColor(String color) {
        this.color = color;
        return this;
    }
}
