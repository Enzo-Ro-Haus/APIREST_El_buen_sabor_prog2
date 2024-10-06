package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Client;
import com.example.MiapiEnzoRH.services.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Client")
public class ClientController extends BaseController<Client, Long>{
    public ClientController(ClientService service) {
        super(service);
    }
}
