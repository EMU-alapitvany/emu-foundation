package com.codecool.emualapitvany.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Patient extends User {

    @NotEmpty
    private String parentFirstName;
    @NotEmpty
    private String parentSecondName;

    public Patient(@NotEmpty String username, @NotEmpty String firstName, @NotEmpty String secondName,
                   @NotEmpty String email, @NotEmpty String password, String parentFirstName,
                   String parentSecondName) {
        super(username, firstName, secondName, email, password);
        this.parentSecondName = parentSecondName;
        this.parentFirstName = parentFirstName;
    }
}
