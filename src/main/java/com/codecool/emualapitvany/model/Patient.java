package com.codecool.emualapitvany.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Patient extends User {

    @NotEmpty
    private String parentFirstName;

    @NotEmpty
    private String parentSecondName;

}
