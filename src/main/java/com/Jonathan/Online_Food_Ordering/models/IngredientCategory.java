package com.Jonathan.Online_Food_Ordering.models;

import com.Jonathan.Online_Food_Ordering.persistence.entities.IngredientsItemEntity;
import com.Jonathan.Online_Food_Ordering.persistence.entities.RestaurantEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientCategory {
    private Long id;

    private String name;

    private Restaurant restaurant;


    private List<IngredientsItem> ingredients = new ArrayList<>();
}
