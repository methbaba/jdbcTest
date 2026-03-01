package com.example.demo_for_jdbc.controller;

import com.example.demo_for_jdbc.model.hospital;
import com.example.demo_for_jdbc.service.infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basic")
public class basicController {

    @Autowired
    infoService info;

    @GetMapping("/getAll")
    public List<hospital> getAll(){

    }


}
