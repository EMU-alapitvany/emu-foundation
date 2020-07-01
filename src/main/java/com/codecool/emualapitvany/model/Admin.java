package com.codecool.emualapitvany.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Admin extends User {


    public Admin(@NotEmpty String username, @NotEmpty String firstName, @NotEmpty String secondName,
                 @NotEmpty String email, @NotEmpty String password) {
        super(username, firstName, secondName, email, password);
    }
}
