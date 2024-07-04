package com.TrungTinh.CRUD_Employee_Backend.repository;

import com.TrungTinh.CRUD_Employee_Backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
