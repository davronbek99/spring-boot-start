package com.example.dev.davron.springbootstart2710.service;

import com.example.dev.davron.springbootstart2710.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
