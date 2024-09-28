package com.menuengineering.dto;

import com.menuengineering.entities.Supplies;

public class SuppliesDTO {

    private Integer id;
    private String category;
    private String name;
    private String unitOfMeasure;
    private String supplier;
    
    public SuppliesDTO(){

    }

    public SuppliesDTO(Integer id, String category, String name, 
    String unitOfMeasure, String supplier){

        this.id = id;
        this.category = category;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.supplier = supplier;

    }

    public SuppliesDTO(Supplies entity){
        this.id = entity.getId();
        this.category = entity.getCategory();
        this.name = entity.getName();
        this.unitOfMeasure = entity.getUnitOfMeasure();
        this.supplier = entity.getSupplier();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    


}
