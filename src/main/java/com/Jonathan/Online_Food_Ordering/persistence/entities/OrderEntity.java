package com.Jonathan.Online_Food_Ordering.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity(name="orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private UserEntity customer;

    @JsonIgnore
    @ManyToOne
    private RestaurantEntity restaurant;

    private Long totalAmount;

    private String orderStatus;

    private Date createdAt;
    @ManyToOne
    private AddressEntity deliveryAddress;
    @OneToMany
    private List<OrderItemEntity> items;


    //private Payment payment;
    private int totalItem;
    private int totalPrice;
}
