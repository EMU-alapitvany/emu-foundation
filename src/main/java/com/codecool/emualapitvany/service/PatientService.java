package com.codecool.emualapitvany.service;

import com.codecool.emualapitvany.model.Patient;
import com.codecool.emualapitvany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PatientService {

    @Autowired
    private UserRepository patientRepository;

    public Patient createNewAdmin(Map<String, String> data){
        Patient patient = Patient.builder()
                .firstName(data.get("firstName"))
                .lastName(data.get("lastName"))
                .username(data.get("username"))
                .email(data.get("email"))
                .password(data.get("password"))
                .role("PATIENT")
                .parentFirstName(data.get("parentFirstName"))
                .parentSecondName(data.get("parentSecondName"))
                .build();
        patientRepository.save(patient);
        return patient;
    }
}
