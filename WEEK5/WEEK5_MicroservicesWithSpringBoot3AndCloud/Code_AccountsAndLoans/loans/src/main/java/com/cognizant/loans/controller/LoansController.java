package com.cognizant.loans.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoansController {
    @GetMapping("/{number}")
    public ResponseEntity<Map<String,Object>> getLoanDetails(@PathVariable String number){
    	Map<String,Object>details=Map.of(
    	   "number",number,
    	   "type","car",
    	   "loan",400000,
    	   "emi",3258,
    	   "tenure",18
        );
    	return ResponseEntity.ok(details); 
    }
}
