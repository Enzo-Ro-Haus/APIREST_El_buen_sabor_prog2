package com.example.MiapiEnzoRH.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category extends Base {

    private String designation;

    @OneToMany(mappedBy = "fatherCategory")
    @Builder.Default
    private Set<Category> subcategory = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    @JsonIgnore
    private Category fatherCategory;
}
