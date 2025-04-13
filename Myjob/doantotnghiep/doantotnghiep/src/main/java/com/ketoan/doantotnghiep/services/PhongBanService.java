package com.ketoan.doantotnghiep.services;

import com.ketoan.doantotnghiep.models.PhongBan;
import com.ketoan.doantotnghiep.repository.PhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongBanService {

    @Autowired
    private PhongBanRepository repository;

    public List<PhongBan> findAll() {
        return repository.findAll();
    }

    public Optional<PhongBan> findById(Integer id) {
        return repository.findById(id);
    }

    public PhongBan save(PhongBan entity) {
        return repository.save(entity);
    }

    public PhongBan update(Integer id, PhongBan entity) {
        if (repository.existsById(id)) {
            entity.setMapb(id);
            return repository.save(entity);
        }
        throw new RuntimeException("Entity not found");
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}