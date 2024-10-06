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
@Table(name = "areas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Area extends Base{
    private String name;

    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;
}
