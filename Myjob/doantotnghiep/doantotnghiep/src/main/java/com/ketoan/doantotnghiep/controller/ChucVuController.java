package com.ketoan.doantotnghiep.controller;

import com.ketoan.doantotnghiep.models.ChucVu;
import com.ketoan.doantotnghiep.services.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chucvu")
public class ChucVuController {

    @Autowired
    private ChucVuService service;

    @GetMapping
    public List<ChucVu> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ChucVu> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ChucVu create(@RequestBody ChucVu entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ChucVu> update(@PathVariable Integer id, @RequestBody ChucVu entity) {
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