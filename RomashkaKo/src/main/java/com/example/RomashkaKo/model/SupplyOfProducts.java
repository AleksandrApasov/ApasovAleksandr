package com.example.RomashkaKo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class SupplyOfProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(max = 255, message = "The name exceeds 255 characters")
    private String name;
    @NotNull
    @ManyToOne(cascade = CascadeType.PERSIST)
    Product product;

    @Min(1)
    private int countOfSuppliedProduct;

}
