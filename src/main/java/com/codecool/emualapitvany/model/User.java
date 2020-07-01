package com.codecool.emualapitvany.model;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue
    protected Long id;

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

    // roles of the user (ADMIN, USER,..)
    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private Set<String> roles = new HashSet<>();


    public User(@NotEmpty String username, @NotEmpty String firstName,
                @NotEmpty String secondName, @NotEmpty String email, @NotEmpty String password) {
        this.username = username;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
    }
}
