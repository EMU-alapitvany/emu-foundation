package com.codecool.emualapitvany.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class Therapist extends User {

    @NotNull
    private float salary;

    public Therapist(@NotEmpty String username, @NotEmpty String firstName, @NotEmpty String secondName,
                     @NotEmpty String email, @NotEmpty String password, float salary) {
        super(username, firstName, secondName, email, password);
        this.salary = salary;
    }
}
