package com.ketoan.doantotnghiep.repository;

import com.ketoan.doantotnghiep.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer> {
}
