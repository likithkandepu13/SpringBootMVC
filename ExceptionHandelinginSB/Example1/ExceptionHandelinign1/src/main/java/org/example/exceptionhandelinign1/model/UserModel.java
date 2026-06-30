package org.example.exceptionhandelinign1.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserModel {

    @NotNull(message = "username is null")
    private String username;
    @Size(min = 10, message = "Password must contain at least 10 characters")
    private String password;
    @Email(message = "Invalid email format")
    private String email;
}
