package com.Jonathan.Online_Food_Ordering.models;

import com.Jonathan.Online_Food_Ordering.persistence.entities.FoodEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItem {
    private Long id;
    private Cart cart;
    private Food food;
    private int quantity;

    private List<String> ingredients;

    private Long totalPrice;
}
