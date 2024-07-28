package com.Jonathan.Online_Food_Ordering.persistence.entities;

import com.Jonathan.Online_Food_Ordering.models.ContactInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "restaurant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private UserEntity owner;

    private String name;
    private String description;
    private String cuisineType;

    @OneToOne
    private AddressEntity address;
    @Embedded
    private ContactInformation contactInformation;

    private String openingHours;


    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderEntity> orders = new ArrayList<>();

    @ElementCollection
    @Column(length = 1000)
    private List<String > images;

    private LocalDateTime registrationDate;

    private  boolean open;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private  List<FoodEntity> foods = new ArrayList<>();
}
