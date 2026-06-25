package org.example.curdoperationsbyparams.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.example.curdoperationsbyparams.entity.Description;

@Data
public class productModel
{
    private String pname;
    private DescriptionModel description;
    private int quantity;
}
