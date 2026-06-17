package org.example.validationannotation.model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NonNull;
import org.example.validationannotation.entity.Address;

import java.util.List;

@Data
public class User_model {
    @NonNull
    private String username;
    private List<Address_model> user_address;
    //@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must contain exactly 10 digits")
    @Min(value = 1000000000L, message = "Phone number must be 10 digits")
    @Max(value = 9999999999L, message = "Phone number must be 10 digits")
    private long user_phone;
}
