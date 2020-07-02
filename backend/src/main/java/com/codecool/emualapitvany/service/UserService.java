package java.com.codecool.emualapitvany.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.com.codecool.emualapitvany.model.user.User;
import java.com.codecool.emualapitvany.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createNewUser(User user){
        return userRepository.save(user);
    }
}
