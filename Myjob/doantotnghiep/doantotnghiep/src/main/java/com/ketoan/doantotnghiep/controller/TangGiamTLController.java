package com.ketoan.doantotnghiep.controller;

import com.ketoan.doantotnghiep.models.TangGiamTL;
import com.ketoan.doantotnghiep.services.TangGiamTLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tanggiamtl")
public class TangGiamTLController {

    @Autowired
    private TangGiamTLService service;

    @GetMapping
    public List<TangGiamTL> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TangGiamTL> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TangGiamTL create(@RequestBody TangGiamTL entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TangGiamTL> update(@PathVariable Integer id, @RequestBody TangGiamTL entity) {
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