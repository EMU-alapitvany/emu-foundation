package com.codecool.emualapitvany.service;

import com.codecool.emualapitvany.model.user.User;
import com.codecool.emualapitvany.repository.UserRepository;
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
