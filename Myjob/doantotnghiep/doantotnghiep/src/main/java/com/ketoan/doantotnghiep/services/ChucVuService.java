package com.ketoan.doantotnghiep.services;

import com.ketoan.doantotnghiep.models.ChucVu;
import com.ketoan.doantotnghiep.repository.ChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChucVuService implements CrudService<ChucVu, Integer> {

    @Autowired
    private ChucVuRepository repository;

    @Override
    public List<ChucVu> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ChucVu> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public ChucVu save(ChucVu entity) {
        return repository.save(entity);
    }

    @Override
    public ChucVu update(Integer id, ChucVu entity) {
        if (repository.existsById(id)) {
            entity.setMacv(id);
            return repository.save(entity);
        }
        throw new RuntimeException("Entity not found");
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}