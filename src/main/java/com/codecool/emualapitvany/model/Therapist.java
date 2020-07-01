package com.codecool.emualapitvany.model;

import javax.validation.constraints.NotEmpty;

public class Therapist extends User {

    public Therapist(Long Id, @NotEmpty String username, @NotEmpty String firstName, @NotEmpty String secondName, @NotEmpty String email, @NotEmpty String password) {
        super(Id, username, firstName, secondName, email, password);
    }
}
