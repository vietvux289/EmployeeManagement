package com.example.employeemanagement.repository;

import com.example.employeemanagement.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
