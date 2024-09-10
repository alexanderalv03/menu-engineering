package com.menuengineering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.menuengineering.services.TechnicalSheetService;

@RestController
public class TechnicalSheetController {
    
    private final TechnicalSheetService technicalSheetService;

    @Autowired
    public TechnicalSheetController(TechnicalSheetService technicalSheetService){
        this.technicalSheetService = technicalSheetService;
        
    }
}
