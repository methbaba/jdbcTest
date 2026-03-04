package com.example.demo_for_jdbc.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder

@NoArgsConstructor  // <--- This is the missing piece for Jackson
@AllArgsConstructor
public class Hospital {
    private Integer h_id;
    private String h_name;
    private String city;
    private String state;


}
