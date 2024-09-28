package com.menuengineering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menuengineering.services.SuppliesService;


@RestController
@RequestMapping(value = "/supplies")
public class SuppliesController {
    
    private final SuppliesService suppliesService;

    @Autowired
    public SuppliesController(SuppliesService suppliesService){
        this.suppliesService = suppliesService;
    }

 //   @GetMapping("/")
 //   public String homepage(){
 //       return "homepage";
 //   }


    



}
