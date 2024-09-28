package com.menuengineering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.menuengineering.entities.Supplies;

import jakarta.transaction.Transactional;

@Repository
public interface SuppliesRepository extends JpaRepository<Supplies, Integer>{
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query("UPDATE Supplies SET category = :category, name = :name, unitOfMeasure = :unitOfMeasure, supplier = :supplier WHERE id = :id")
    void update(
        @Param("category") String category,
        @Param("name") String name,
        @Param("unitOfMeasure") String unitOfMeasure,
        @Param("supplier") String supplier,
        @Param("id") Integer id
    );
}
