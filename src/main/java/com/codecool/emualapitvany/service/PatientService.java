package com.codecool.emualapitvany.service;

import com.codecool.emualapitvany.model.Admin;
import com.codecool.emualapitvany.model.Patient;
import com.codecool.emualapitvany.repository.AdminRepository;
import com.codecool.emualapitvany.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient createNewAdmin(Map<String, String> data){
        Patient patient = Patient.builder()
                .firstName(data.get("firstName"))
                .secondName(data.get("secondName"))
                .username(data.get("username"))
                .email(data.get("email"))
                .password(data.get("password"))
                .roles(Collections.singleton("PATIENT"))
                .parentFirstName(data.get("parentFirstName"))
                .parentSecondName(data.get("parentSecondName"))
                .build();
        patientRepository.save(patient);
        return patient;
    }
}
