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
@Table(name = "manofactured_article_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManofacturedArticleDetails extends Base{
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "supply_item_id")
    private SupplyItem supplyItem;

    @ManyToOne
    @JoinColumn(name = "manofactured_article_id")
    private ManofacturedArticle manofacturedArticle;
}
