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
@Table(name = "promotion_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromotionDetails extends Base{
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;
}
