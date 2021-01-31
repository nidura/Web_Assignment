package com.swlc.gadget.dto;

import java.util.List;

public class ItemList {
    private List<ItemDto> itemDto;

    public ItemList(List<ItemDto> itemDto) {
        this.itemDto = itemDto;
    }

    public List<ItemDto> getItemDto() {
        return itemDto;
    }

    public ItemList setItemDto(List<ItemDto> itemDto) {
        this.itemDto = itemDto;
        return this;
    }
}
