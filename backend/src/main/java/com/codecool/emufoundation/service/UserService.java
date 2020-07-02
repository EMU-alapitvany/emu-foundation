package com.codecool.emufoundation.service;

import com.codecool.emufoundation.model.user.User;
import com.codecool.emufoundation.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createNewUser(User user){
        return userRepository.save(user);
    }
}
