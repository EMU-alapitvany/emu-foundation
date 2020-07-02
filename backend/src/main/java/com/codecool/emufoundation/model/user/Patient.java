package com.codecool.emufoundation.model.user;

import lombok.Data;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Patient extends User {

    @NotEmpty
    private String parentFirstName;

    @NotEmpty
    private String parentSecondName;

}
