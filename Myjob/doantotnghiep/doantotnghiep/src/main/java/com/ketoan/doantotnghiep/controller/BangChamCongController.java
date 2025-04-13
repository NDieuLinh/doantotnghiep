package com.ketoan.doantotnghiep.controller;

import com.ketoan.doantotnghiep.models.BangChamCong;
import com.ketoan.doantotnghiep.services.BangChamCongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bangchamcong")
public class BangChamCongController {

    @Autowired
    private BangChamCongService service;

    @GetMapping
    public List<BangChamCong> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BangChamCong> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public BangChamCong create(@RequestBody BangChamCong entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BangChamCong> update(@PathVariable Integer id, @RequestBody BangChamCong entity) {
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