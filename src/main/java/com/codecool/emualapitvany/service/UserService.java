package com.codecool.emualapitvany.service;

import com.codecool.emualapitvany.model.user.User;
import com.codecool.emualapitvany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository patientRepository;

    public User createNewUser(User user){
        return patientRepository.save(user);
    }
}
