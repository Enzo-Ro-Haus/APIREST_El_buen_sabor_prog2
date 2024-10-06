package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.ClientUser;
import com.example.MiapiEnzoRH.repositories.ClientUserRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientUserService extends BaseService<ClientUser, Long>{
    public ClientUserService(ClientUserRepository clientUserRepository) {
        super(clientUserRepository);
    }
}
