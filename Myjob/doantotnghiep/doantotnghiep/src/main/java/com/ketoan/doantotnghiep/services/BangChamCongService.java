package com.ketoan.doantotnghiep.services;

import com.ketoan.doantotnghiep.models.BangChamCong;
import com.ketoan.doantotnghiep.repository.BangChamCongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BangChamCongService implements CrudService<BangChamCong, Integer> {

    @Autowired
    private BangChamCongRepository repository;

    @Override
    public List<BangChamCong> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<BangChamCong> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public BangChamCong save(BangChamCong entity) {
        return repository.save(entity);
    }

    @Override
    public BangChamCong update(Integer id, BangChamCong entity) {
        if (repository.existsById(id)) {
            entity.setBcc(id);
            return repository.save(entity);
        }
        throw new RuntimeException("Entity not found");
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}