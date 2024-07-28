package com.Jonathan.Online_Food_Ordering.models;

import com.Jonathan.Online_Food_Ordering.persistence.entities.CartItemEntity;
import com.Jonathan.Online_Food_Ordering.persistence.entities.UserEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private Long id;

    private User customer;

    private Long total;

    private List<CartItem> item = new ArrayList<>();
}
