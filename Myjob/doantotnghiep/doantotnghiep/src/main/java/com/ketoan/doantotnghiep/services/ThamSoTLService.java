package com.ketoan.doantotnghiep.services;

import com.ketoan.doantotnghiep.models.ThamSoTL;
import com.ketoan.doantotnghiep.repository.ThamSoTLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThamSoTLService implements CrudService<ThamSoTL, Integer> {

    @Autowired
    private ThamSoTLRepository repository;

    @Override
    public List<ThamSoTL> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ThamSoTL> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ThamSoTL save(ThamSoTL entity) {
        return repository.save(entity);
    }

    @Override
    public ThamSoTL update(Integer id, ThamSoTL entity) {
        if (repository.existsById(id)) {
            entity.setThangnam(id);
            return repository.save(entity);
        }
        throw new RuntimeException("Entity not found");
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}