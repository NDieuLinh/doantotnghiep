package com.ketoan.doantotnghiep.repository;

import com.ketoan.doantotnghiep.models.BangChamCong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BangChamCongRepository extends JpaRepository<BangChamCong,Integer> {
}
