package com.example.demo_for_jdbc.dao;

import com.example.demo_for_jdbc.model.Hospital;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


@Slf4j
@Repository
public class HospitalDAO {

    private final  DataSource dataSource;

    public HospitalDAO(DataSource dataSource){
        this.dataSource =dataSource;
    }

    public Hospital getById(int id ){
        String qs= "select * from hospital.hospital_info where  1=1 ";
        StringBuilder qos= new StringBuilder();
        qos.append(qs);
        try{
            Connection con = dataSource.getConnection();
            qos.append(" and h_id="+id);
            PreparedStatement ps = con.prepareStatement(qos.toString());
            ResultSet rs= ps.executeQuery();


            while(rs.next()){
               return  Hospital.builder()
                        .h_id(rs.getInt("h_id"))
                        .h_name(rs.getString("h_name"))
                        .city(rs.getString("city"))
                        .state(rs.getString("state"))
                        .build();
            }


        }
        catch (Exception e){

        }

        return null;

    }


    public ResponseEntity<Void> insertData(Hospital hospital ){
        StringBuilder bu = new StringBuilder();
        bu.append("insert into hospital.hospital_info values (?,?,?,?) ");
        try{
           Connection con = dataSource.getConnection();
           //bu.append("("+hospital.getH_id()+","+hospital.getH_name()+","+hospital.getCity()+","+hospital.getState()+")");
           PreparedStatement ps = con.prepareStatement(bu.toString());
            ps.setInt(1,hospital.getH_id());
            ps.setString(2,hospital.getH_name());
            ps.setString(3,hospital.getCity());
            ps.setString(4,hospital.getState());
            ps.execute();


        }
        catch(Exception e){
                System.out.print("11");
        }
        return ResponseEntity.ok(null);
    }



}
