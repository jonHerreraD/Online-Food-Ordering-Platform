package com.Jonathan.Online_Food_Ordering.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "Food")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private Long price;
    @ManyToOne
    private CategoryEntity foodCategory;
    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private boolean available;
    @ManyToOne
    private RestaurantEntity restaurant;

    private boolean isVegetarian;

    private boolean isSeasonal;

    @ManyToMany
    private List<IngredientsItemEntity>  ingredients = new ArrayList<>();


    private Date creationDate;
}
