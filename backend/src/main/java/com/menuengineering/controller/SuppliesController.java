package com.menuengineering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.menuengineering.services.SuppliesService;

@Controller
public class SuppliesController {
    
    private final SuppliesService suppliesService;

    @Autowired
    public SuppliesController(SuppliesService suppliesService){
        this.suppliesService = suppliesService;
    }

    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }



}
