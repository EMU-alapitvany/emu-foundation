package com.codecool.emualapitvany.service;

import com.codecool.emualapitvany.model.Therapist;
import com.codecool.emualapitvany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TherapistService {

    @Autowired
    private UserRepository therapistRepository;

    public Therapist createNewTherapist(Map<String, String> data){
        Therapist therapist = Therapist.builder()
                .firstName(data.get("firstName"))
                .lastName(data.get("secondName"))
                .username(data.get("username"))
                .email(data.get("email"))
                .password(data.get("password"))
                .role("THERAPIST")
                .salary(Float.parseFloat(data.get("salary")))
                .build();
        therapistRepository.save(therapist);
        return therapist;
    }
}
