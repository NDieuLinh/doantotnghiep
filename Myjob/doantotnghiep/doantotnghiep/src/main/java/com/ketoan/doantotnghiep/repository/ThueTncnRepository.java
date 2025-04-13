package com.ketoan.doantotnghiep.repository;

import com.ketoan.doantotnghiep.models.ThueTncn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThueTncnRepository extends JpaRepository<ThueTncn,Integer> {
}
