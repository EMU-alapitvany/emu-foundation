package com.codecool.emualapitvany.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue
    protected Long Id;

    @NotEmpty
    protected String username;

    @NotEmpty
    protected String firstName;

    @NotEmpty
    protected String secondName;

    @NotEmpty
    protected String email;

    @NotEmpty
    protected String password;

}
