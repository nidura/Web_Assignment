package com.swlc.gadget.service;

import com.swlc.gadget.dto.ItemDto;
import com.swlc.gadget.dto.ItemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    RestTemplate restTemplate;

    public List<ItemDto> getAllItems() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        List<ItemDto> returnList = new ArrayList<>();

        ResponseEntity<ItemList> abansItems = restTemplate.getForEntity("http://localhost:8089/v1/api/abans/item",
                ItemList.class);
        returnList.addAll(abansItems.getBody().getItemDto());
        ResponseEntity<ItemList> singerItems = restTemplate.getForEntity("http://localhost:8089/v1/api/singer/item",
                ItemList.class);
        returnList.addAll(singerItems.getBody().getItemDto());
        ResponseEntity<ItemList> softlogicItems = restTemplate.getForEntity("http://localhost:8089/v1/api/softlogic/item",
                ItemList.class);
        returnList.addAll(softlogicItems.getBody().getItemDto());
        return returnList;
    }

    public List<ItemDto> searchItem(String itemName, String brand, String category) {
        List<ItemDto> returnList = new ArrayList<>();
        ResponseEntity<ItemList> abansItems = restTemplate.getForEntity("http://localhost:8089/v1/api/abans/item/"+itemName+"/"+brand+"/"+category,
                ItemList.class);
        returnList.addAll(abansItems.getBody().getItemDto());
        ResponseEntity<ItemList> singerItems = restTemplate.getForEntity("http://localhost:8089/v1/api/singer/item"+itemName+"/"+brand+"/"+category,
                ItemList.class);
        returnList.addAll(singerItems.getBody().getItemDto());
        ResponseEntity<ItemList> softlogicItems = restTemplate.getForEntity("http://localhost:8089/v1/api/softlogic/item"+itemName+"/"+brand+"/"+category,
                ItemList.class);
        returnList.addAll(softlogicItems.getBody().getItemDto());
        return returnList;
    }
}
