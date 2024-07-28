package com.Jonathan.Online_Food_Ordering.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "ingredientsItem")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private IngredientCategoryEntity category;

    @JsonIgnore
    @ManyToOne
    private RestaurantEntity restaurant;

    private boolean inStoke=true;
}
