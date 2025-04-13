package com.ketoan.doantotnghiep.services;

import com.ketoan.doantotnghiep.models.ThueTncn;
import com.ketoan.doantotnghiep.repository.ThueTncnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThueTncnService {

    @Autowired
    private ThueTncnRepository repository;

    public List<ThueTncn> findAll() {
        return repository.findAll();
    }

    public Optional<ThueTncn> findById(Integer id) {
        return repository.findById(id);
    }

    public ThueTncn save(ThueTncn entity) {
        return repository.save(entity);
    }

    public ThueTncn update(Integer id, ThueTncn entity) {
        if (repository.existsById(id)) {
            entity.setBacthue(id);
            return repository.save(entity);
        }
        throw new RuntimeException("Entity not found");
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}