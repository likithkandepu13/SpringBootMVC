package org.example.exceptionhandelinign1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class UserInfo {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int userid;
    private String username;
    private String password;
    private String email;

}
