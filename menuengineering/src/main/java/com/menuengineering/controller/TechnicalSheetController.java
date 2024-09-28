package com.menuengineering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.menuengineering.services.TechnicalSheetService;

@Controller
public class TechnicalSheetController {
    
    private final TechnicalSheetService technicalSheetService;

    @Autowired
    public TechnicalSheetController(TechnicalSheetService technicalSheetService){
        this.technicalSheetService = technicalSheetService;
        
    }

    @GetMapping("/")
    public String homepage(){
        return "homepage";
    }
}
