package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.*;
import com.example.MiapiEnzoRH.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ClientUser")
public class ClientUserController extends BaseController<ClientUser, Long> {
    public ClientUserController(ClientUserService service) {
        super(service);
    }
}