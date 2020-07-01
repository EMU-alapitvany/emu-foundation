package com.codecool.emualapitvany.service;

import com.codecool.emualapitvany.model.Admin;
import com.codecool.emualapitvany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AdminService {

    @Autowired
    private UserRepository adminRepository;

    public Admin createNewAdmin(Map<String, String> data){
        Admin admin = Admin.builder()
                .firstName(data.get("firstName"))
                .lastName(data.get("lastName"))
                .username(data.get("username"))
                .email(data.get("email"))
                .password(data.get("password"))
                .role("ADMIN")
                .build();
        adminRepository.save(admin);
        return admin;
    }
}
