package com.ketoan.doantotnghiep.repository;

import com.ketoan.doantotnghiep.models.TangGiamTL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TangGiamTLRepository extends JpaRepository<TangGiamTL,Integer> {
}
