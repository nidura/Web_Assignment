package com.swlc.gadget.controller;

import com.swlc.gadget.dto.Client;
import com.swlc.gadget.repository.ClientRepository;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("v1/client/controller")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping
    public Client onboardClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @PatchMapping
    public Client updateClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @GetMapping(path = "/deactivate/{id}")
    public boolean deactivateClient(@PathVariable(name = "id") Integer id){
        Optional<Client> byId = clientRepository.findById(id);
        if(byId.isPresent()){
            byId.get().setStatus("DEACTIVATED");
            clientRepository.save(byId.get());
            return true;
        }
       return false;
    }
}
