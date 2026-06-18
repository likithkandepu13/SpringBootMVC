package org.example.queryparams.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserModel {
    @NotNull
    private String username;
    private String city;
    @Email
    private String email;
    private String country;
    private String gender;
}
