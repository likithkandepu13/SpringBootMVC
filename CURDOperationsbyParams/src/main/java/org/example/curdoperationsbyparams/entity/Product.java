package org.example.curdoperationsbyparams.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private String pname;
    @OneToOne(cascade=CascadeType.ALL)
    private Description description;
    private int quantity;

}
