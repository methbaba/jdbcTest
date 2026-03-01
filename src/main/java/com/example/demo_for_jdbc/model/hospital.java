package com.example.demo_for_jdbc.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class hospital {
    private Integer hospital_id;
    private String hospital_name;
    private String hospital_city;
    private String hospital_state;


}
