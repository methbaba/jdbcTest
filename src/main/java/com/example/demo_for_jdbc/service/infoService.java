package com.example.demo_for_jdbc.service;

import com.example.demo_for_jdbc.model.hospital;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class infoService {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate =jdbcTemplate;
    }
    public List<hospital> getAllInfo(){
        ArrayList<hospital> ret = new ArrayList<>();
        StringBuilder sm = new StringBuilder();
        sm.append("select * from hospital.hospital_info");

        return  ret;

    }

}
