package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "supply_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SupplyItem extends Article{

    @Column(name = "buying_price")
    private Double buyPrice;
    @Column(name = "anual_stock")
    private Integer anualStock;
    @Column(name = "max_stock")
    private Integer maxStock;
    @Column(name = "its_for_making")
    private Boolean itsForMaking;
}
