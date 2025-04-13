package com.ketoan.doantotnghiep.repository;

import com.ketoan.doantotnghiep.models.ThamSoTL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThamSoTLRepository extends JpaRepository<ThamSoTL,Integer> {
}
