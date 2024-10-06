package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Client;
import com.example.MiapiEnzoRH.repositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends BaseService<Client, Long> {
    public ClientService(ClientRepository clientRepository) {
        super(clientRepository);
    }
}
