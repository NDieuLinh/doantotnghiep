package com.ketoan.doantotnghiep.services;

import com.ketoan.doantotnghiep.models.Employees;
import com.ketoan.doantotnghiep.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository repository;

    public List<Employees> findAll() {
        return repository.findAll();
    }

    public Optional<Employees> findById(Integer id) {
        return repository.findById(id);
    }

    public Employees save(Employees entity) {
        return repository.save(entity);
    }

    public Employees update(Integer id, Employees entity) {
        if (repository.existsById(id)) {
            entity.setMacv(id);
            return repository.save(entity);
        }
        throw new RuntimeException("Entity not found");
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}