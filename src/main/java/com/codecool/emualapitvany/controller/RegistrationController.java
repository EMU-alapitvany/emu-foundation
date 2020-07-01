package com.codecool.emualapitvany.controller;

import com.codecool.emualapitvany.service.AdminService;
import com.codecool.emualapitvany.service.PatientService;
import com.codecool.emualapitvany.service.TherapistService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/registration")
@AllArgsConstructor
public class RegistrationController {

    private PatientService patientService;
    private TherapistService therapistService;
    private AdminService adminService;

    @PostMapping("/patient")
    public void patientRegister(@RequestBody Map<String, String> data){
        patientService.createNewAdmin(data);
    }

    @PostMapping("/therapist")
    public void therapistRegister(@RequestBody Map<String, String> data){
        therapistService.createNewTherapist(data);
    }

    @PostMapping("/admin")
    public void adminRegister(@RequestBody Map<String, String> data){
        adminService.createNewAdmin(data);
    }
}
