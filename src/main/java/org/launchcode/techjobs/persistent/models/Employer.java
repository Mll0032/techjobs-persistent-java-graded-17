package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    private String location;

    public Employer() {
    }
}
