package com.chibocorp.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class Credential implements Cloneable {
    private String eventName;
    private String name;
    private String charge;
    private String rut;
    private LocalDate creationDate;
    
    @Override
    public Credential clone() throws CloneNotSupportedException {
        try {
            return new Credential(
                this.eventName,
                this.charge,
                this.name,
                this.rut,
                this.creationDate
            );
        } catch (Exception e) {
            throw new AssertionError("ayuda" + e.getMessage());
        }
    }

}