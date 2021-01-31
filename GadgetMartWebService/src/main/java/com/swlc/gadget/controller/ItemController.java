package com.swlc.gadget.controller;

import com.swlc.gadget.dto.ItemDto;
import com.swlc.gadget.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/api/gadget-mart/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<ItemDto> getAllItems(){
      return itemService.getAllItems();
    }

    @GetMapping(path = "/search")
    public List<ItemDto> searchItem(@RequestParam(name = "name",required = false) String itemName,
                           @RequestParam(name = "brand",required = false) String brand,
                           @RequestParam(name = "category",required = false) String category){
        return itemService.searchItem(itemName,brand,category);
    }

}
