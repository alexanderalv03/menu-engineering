package com.menuengineering.services;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import com.menuengineering.dto.SuppliesDTO;
import com.menuengineering.entities.Supplies;
import com.menuengineering.repositories.SuppliesRepository;

import jakarta.transaction.Transactional;

@Service
public class SuppliesService {
    private final SuppliesRepository repository;

    public SuppliesService(SuppliesRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public SuppliesDTO insert(SuppliesDTO dto) {
        Supplies entity = new Supplies(null, dto.getCategory(), dto.getName(), 
                dto.getUnitOfMeasure(), dto.getSupplier());
        entity = repository.save(entity);
        return new SuppliesDTO(entity);
    }
    
    public List<SuppliesDTO> findAll() {
        List<Supplies> list = repository.findAll();
        return list.stream()
                .map(SuppliesDTO::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public SuppliesDTO update(SuppliesDTO dto) {
        repository.update(dto.getCategory(), dto.getName(), 
                dto.getUnitOfMeasure(), dto.getSupplier(), dto.getId());
        Supplies entity = new Supplies(dto);
        return new SuppliesDTO(entity);
    }

    @Transactional
    public void delete(Integer id) throws BadRequestException {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("Id can't be found");
        }
    }
    
    public Long count() {
        return repository.count();
    }

}
