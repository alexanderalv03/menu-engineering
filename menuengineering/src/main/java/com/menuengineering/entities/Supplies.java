package com.menuengineering.entities;

import java.io.Serial;
import java.io.Serializable;

import com.menuengineering.dto.SuppliesDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "tb_supplies")
public class Supplies implements Serializable {
    @Serial
    private static final long serialVersionUID = 998341892L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotEmpty(message = "The category must be informed")
    private String category;

    @NotEmpty(message = "The name must be informed")    
    private String name;
    
    @NotEmpty(message = "The unit of measure must be informed")
    private String unitOfMeasure;
    
    @NotEmpty(message = "The supplier must be informed")
    private String supplier;
    
    public Supplies(){

    }

    public Supplies(Integer id, String category, String name,
     String unitOfMeasure, String supplier){
        this.id = id;
        this.category = category;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.supplier = supplier;
     }
     public Supplies(SuppliesDTO dto){
        this.id = dto.getId();
        this.category = dto.getCategory();
        this.name = dto.getName();
        this.unitOfMeasure = dto.getUnitOfMeasure();
        this.supplier = dto.getSupplier();
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
