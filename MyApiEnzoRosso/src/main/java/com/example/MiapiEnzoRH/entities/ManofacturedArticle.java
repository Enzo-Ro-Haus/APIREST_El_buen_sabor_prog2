package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "manofactured_articles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ManofacturedArticle extends Article {

    private String description;

    @Column(name = "estimated_minutes")
    private Integer estimatedMinutes;
    private String preparation;
}
