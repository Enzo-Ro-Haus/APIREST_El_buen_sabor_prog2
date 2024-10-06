package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public class Article extends Base{

    protected String designation;
    @Column(name = "selling_price")
    protected Double sellingPrice;

    @OneToMany
    @Builder.Default
    protected Set<Image> articleImges = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "category_id")
    protected Category category;

    @ManyToOne
    @JoinColumn(name = "measurement_unit_id")
    protected MeasurementUnit measurementUnit;

}
