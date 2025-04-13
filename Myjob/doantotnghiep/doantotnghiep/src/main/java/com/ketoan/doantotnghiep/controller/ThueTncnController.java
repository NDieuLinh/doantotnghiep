package com.ketoan.doantotnghiep.controller;

import com.ketoan.doantotnghiep.models.ThueTncn;
import com.ketoan.doantotnghiep.services.ThueTncnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/thuetncn")
public class ThueTncnController {

    @Autowired
    private ThueTncnService service;

    @GetMapping
    public List<ThueTncn> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ThueTncn> getById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ThueTncn create(@RequestBody ThueTncn entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ThueTncn> update(@PathVariable Integer id, @RequestBody ThueTncn entity) {
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