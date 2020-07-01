package com.codecool.emualapitvany.service;

import com.codecool.emualapitvany.model.Admin;
import com.codecool.emualapitvany.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin createNewAdmin(Map<String, String> data){
        Admin admin = Admin.builder()
                .firstName(data.get("firstName"))
                .secondName(data.get("secondName"))
                .username(data.get("username"))
                .email(data.get("email"))
                .password(data.get("password"))
                .roles(Collections.singleton("ADMIN"))
                .build();
        adminRepository.save(admin);
        return admin;
    }
}
