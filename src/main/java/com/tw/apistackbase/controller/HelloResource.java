package com.tw.apistackbase.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/criminalCases")
public class HelloResource {

    private final Logger log = Logger.getLogger(this.getClass().getName());

//    @GetMapping(path = "/{userName}", produces = {"application/json"})
//    public ResponseEntity<String> getAll(@PathVariable String userName) {
//
//        return ResponseEntity.ok("Hello:" + userName);
//    }
    private List<CriminalCase> result = new ArrayList();
    @GetMapping()

    public ResponseEntity getAllCriminalCase(){

        result.add(new CriminalCase());
        return ResponseEntity.ok().body(result);
    }

    @PostMapping()
    public ResponseEntity createCriminalCase(@RequestBody CriminalCase criminalCase){
        result.add(criminalCase);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity putCriminalCase(@PathVariable Integer id,@RequestBody CriminalCase criminalCase){
        result.add(criminalCase);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCriminalCase(@PathVariable Integer id,@RequestBody CriminalCase criminalCase){
        result.remove(criminalCase);
        return ResponseEntity.ok().build();
    }



}
