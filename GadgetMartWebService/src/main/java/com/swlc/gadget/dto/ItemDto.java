package com.swlc.gadget.dto;


public class ItemDto {

    private int id;
    private String itemName;
    private String brand;
    private String unitPrice;
    private String logo_url;
    private String color;

    public ItemDto() {
    }

    public int getId() {
        return id;
    }

    public ItemDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public ItemDto setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public ItemDto setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public ItemDto setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public ItemDto setLogo_url(String logo_url) {
        this.logo_url = logo_url;
        return this;
    }

    public String getColor() {
        return color;
    }

    public ItemDto setColor(String color) {
        this.color = color;
        return this;
    }
}
