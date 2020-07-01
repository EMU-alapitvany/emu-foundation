package com.codecool.emualapitvany.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@SuperBuilder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Patient extends User {

    @NotEmpty
    private String parentFirstName;

    @NotEmpty
    private String parentSecondName;

}
