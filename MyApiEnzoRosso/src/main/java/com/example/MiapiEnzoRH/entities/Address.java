package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "addresses")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address extends Base{
    private  String street;
    private  Integer number;
    private  Integer pc;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;
}
