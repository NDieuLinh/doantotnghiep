package com.ketoan.doantotnghiep.controller;

import com.ketoan.doantotnghiep.models.ThamSoTL;
import com.ketoan.doantotnghiep.services.ThamSoTLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/thamsotl")
public class ThamSoTLController {

    @Autowired
    private ThamSoTLService service;

    @GetMapping
    public List<ThamSoTL> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ThamSoTL> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ThamSoTL create(@RequestBody ThamSoTL entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ThamSoTL> update(@PathVariable Integer id, @RequestBody ThamSoTL entity) {
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