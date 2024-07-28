package com.Jonathan.Online_Food_Ordering.models;

import com.Jonathan.Online_Food_Ordering.persistence.entities.FoodEntity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private Long id;
    private Food food;
    private int quantity;
    private Long totalPrice;
    private List<String> ingredients;
}
