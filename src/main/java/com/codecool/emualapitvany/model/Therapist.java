package com.codecool.emualapitvany.model;

import javax.validation.constraints.NotEmpty;

public class Therapist extends User {

    @NotNull
    private float salary;

}
