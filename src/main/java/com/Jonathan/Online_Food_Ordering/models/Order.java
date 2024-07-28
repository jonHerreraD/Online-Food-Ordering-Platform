package com.Jonathan.Online_Food_Ordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private User customer;
    private Restaurant restaurant;
    private Long totalAmount;
    private String orderStatus;
    private Date createdAt;
    private Address deliveryAddress;
    private List<OrderItem> items;
    private int totalItem;
    private int totalPrice;
}
