package edu.miu.cs.cs425.finalreview.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supplierId;
    @NotNull
    @Column(nullable = false, unique = true)
    private Integer supplierNumber;
    @NotBlank
    private String name;
    private String contactPhoneNumber;
    @OneToMany(mappedBy = "supplier")
    private List<Product> product;
}
