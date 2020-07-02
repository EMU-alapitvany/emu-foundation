package java.com.codecool.emualapitvany.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.com.codecool.emualapitvany.model.user.Admin;
import java.com.codecool.emualapitvany.model.user.Patient;
import java.com.codecool.emualapitvany.model.user.Therapist;
import java.com.codecool.emualapitvany.model.user.User;
import java.com.codecool.emualapitvany.service.UserService;


@CrossOrigin
@RestController
@RequestMapping("/registration")
@AllArgsConstructor
public class RegistrationController {

    private UserService userService;

    @PostMapping("/patient")
    public User patientRegister(@RequestBody Patient user){
        user.getRoles().add("PATIENT");
        return userService.createNewUser(user);
    }

    @PostMapping("/therapist")
    public User therapistRegister(@RequestBody Therapist user){
        user.getRoles().add("THERAPIST");
        return userService.createNewUser(user);
    }

    @PostMapping("/admin")
    public User adminRegister(@RequestBody Admin user){
        user.getRoles().add("ADMIN");
        return userService.createNewUser(user);
    }
}
