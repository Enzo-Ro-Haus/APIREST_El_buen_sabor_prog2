package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "branches")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Branch extends Base{

    private String name;
    @Column(name = "opening_hours")
    private LocalTime openingHours;
    @Column(name = "closing_hours")
    private LocalTime closingHours;
    private Boolean headquarters;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToMany
    @JoinTable(name = "branch_category",
            joinColumns = @JoinColumn(name = "branch_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    @Builder.Default
    private Set<Category> categories = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "branch_promotion",
            joinColumns = @JoinColumn(name = "branch_id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_id"))
    @Builder.Default
    private Set<Promotion> promotions = new HashSet<>();
}
