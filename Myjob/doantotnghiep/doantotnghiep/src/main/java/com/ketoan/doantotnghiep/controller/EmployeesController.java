package com.ketoan.doantotnghiep.controller;

import com.ketoan.doantotnghiep.models.Employees;
import com.ketoan.doantotnghiep.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    @Autowired
    private EmployeesService service;

    @GetMapping
    public List<Employees> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employees> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employees create(@RequestBody Employees entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employees> update(@PathVariable Integer id, @RequestBody Employees entity) {
        try {
            return ResponseEntity.ok(service.update(id, entity));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}