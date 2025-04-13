package com.ketoan.doantotnghiep.repository;

import com.ketoan.doantotnghiep.models.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan,Integer> {
}
