package org.example.validationannotation.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Address_model {

    @NotNull
    @Size(min = 3, max = 10, message = "size limited")
    private String street;
    @NotNull
    private String city;
    @NotNull
    private String state;
    @NotNull
    private String country;
}
