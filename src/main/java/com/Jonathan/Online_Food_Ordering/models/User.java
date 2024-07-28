package com.Jonathan.Online_Food_Ordering.models;

import com.Jonathan.Online_Food_Ordering.dto.RestaurantDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private USER_ROLE role = USER_ROLE.ROLE_CUSTOMER;
    private List<Order> orders = new ArrayList<>();
    private List<RestaurantDto> favorites = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();
}
