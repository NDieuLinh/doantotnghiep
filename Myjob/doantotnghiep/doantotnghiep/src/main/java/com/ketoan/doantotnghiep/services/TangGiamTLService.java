package com.ketoan.doantotnghiep.services;

import com.ketoan.doantotnghiep.models.TangGiamTL;
import com.ketoan.doantotnghiep.repository.TangGiamTLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TangGiamTLService {

    @Autowired
    private TangGiamTLRepository repository;

    public List<TangGiamTL> findAll() {
        return repository.findAll();
    }

    public Optional<TangGiamTL> findById(Integer id) {
        return repository.findById(id);
    }

    public TangGiamTL save(TangGiamTL entity) {
        return repository.save(entity);
    }

    public TangGiamTL update(Integer id, TangGiamTL entity) {
        if (repository.existsById(id)) {
            entity.setMalg(id);
            return repository.save(entity);
        }
        throw new RuntimeException("Entity not found");
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}