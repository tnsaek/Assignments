package edu.miu.cs.cs425.finalreview.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;
    @NotNull
    @Column(nullable = false, unique = true)
    private Long productNumber;
    @NotBlank
    private String name;
    private Double unitPrice;
    private Integer quantityInStock;
    private LocalDate dateSupplied;
    @ManyToOne
    private Supplier supplier;
}
