package com.codecool.emualapitvany.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Patient extends User {

    @NotNull
    private String parentFirstName;

    @NotNull
    private String parentSecondName;

}

