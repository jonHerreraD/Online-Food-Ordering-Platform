package com.Jonathan.Online_Food_Ordering.models;

import com.Jonathan.Online_Food_Ordering.persistence.entities.CategoryEntity;
import com.Jonathan.Online_Food_Ordering.persistence.entities.IngredientsItemEntity;
import com.Jonathan.Online_Food_Ordering.persistence.entities.RestaurantEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    private Long id;
    private String name;
    private String description;
    private Long price;
    private Category foodCategory;
    private List<String> images;
    private boolean available;
    private Restaurant restaurant;
    private boolean isVegetarian;
    private boolean isSeasonal;
    private List<IngredientsItem>  ingredients = new ArrayList<>();
    private Date creationDate;
}
