package com.example.MiapiEnzoRH.entities;

import com.example.MiapiEnzoRH.entities.enums.PromotionType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "promotions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Promotion extends Base{

    private String designation;
    @Column(name = "start_time")
    private LocalDate startTime;
    @Column(name = "end_time")
    private LocalDate endTime;
    @Column(name = "start_hour")
    private LocalTime startHour;
    @Column(name = "end_hour")
    private LocalTime endHour;
    @Column(name = "discount_description")
    private String discountDescription;
    @Column(name = "promotion_price")
    private Double promotionPrice;
    @Column(name = "promotion_type")
    private PromotionType promotionType;

    @OneToMany
    @Builder.Default
    private Set<Image> promotionImages = new HashSet<>();

}
