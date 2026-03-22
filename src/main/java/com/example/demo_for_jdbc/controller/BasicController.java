package com.example.demo_for_jdbc.controller;

import com.example.demo_for_jdbc.model.Hospital;
import com.example.demo_for_jdbc.service.InfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basic")
public class BasicController {

        private final InfoService infoService ;


        public BasicController(InfoService infoService){
            this.infoService =infoService;
        }


    @PostMapping("/insertData")
    public ResponseEntity<Void> insert(@RequestBody Hospital hospital){
        return  infoService.insertData(hospital);
    }
    @GetMapping("getBYId/{id}")
    public ResponseEntity<Hospital> get_by_id(@PathVariable int id ){
        return  ResponseEntity.ok(infoService.getById(id));
    }


    @PostMapping("/insertData")
    public ResponseEntity<Void> delete(@RequestBody Hospital hospital){
        return  infoService.insertData(hospital);
    }

}
