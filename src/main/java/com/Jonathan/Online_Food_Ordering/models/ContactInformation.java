package com.Jonathan.Online_Food_Ordering.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactInformation {

    private  String email;
    private  String mobile;
    private String twitter;
    private String instagram;
}
