package com.example.demo_for_jdbc.service;

import com.example.demo_for_jdbc.dao.HospitalDAO;
import com.example.demo_for_jdbc.model.Hospital;
import org.springframework.data.relational.core.sql.In;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoService {


    private final HospitalDAO hospitalDAO;
    public InfoService(HospitalDAO hospitalDAO){
        this.hospitalDAO=hospitalDAO;
    }

    public Hospital getById(int id ){

        return  hospitalDAO.getById(id);
    }

    public ResponseEntity<Void> insertData(Hospital hospital ){
        return  hospitalDAO.insertData(hospital);
    }

}
