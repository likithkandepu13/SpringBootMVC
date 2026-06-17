package org.example.validationannotation.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String username;
    private long user_phone;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_address")
    private List<Address> user_address;
}
