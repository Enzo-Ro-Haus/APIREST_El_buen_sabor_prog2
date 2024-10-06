package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.User;
import com.example.MiapiEnzoRH.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, Long> {
    public UserService(UserRepository userRepository){
        super(userRepository);
    }
}
