package com.zoho.ZOHO.repository;



import com.zoho.ZOHO.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No need to write any code – JpaRepository provides basic CRUD
}