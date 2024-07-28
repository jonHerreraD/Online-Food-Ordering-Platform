package com.Jonathan.Online_Food_Ordering.models;

import com.Jonathan.Online_Food_Ordering.persistence.entities.IngredientCategoryEntity;
import com.Jonathan.Online_Food_Ordering.persistence.entities.RestaurantEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsItem {
    private Long id;

    private String name;


    private IngredientCategory category;

    private Restaurant restaurant;

    private boolean inStoke=true;
}
