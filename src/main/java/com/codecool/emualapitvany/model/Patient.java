package com.codecool.emualapitvany.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Patient {


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

    @NotEmpty
    private String parentFirstName;
    @NotEmpty
    private String parentSecondName;

}
