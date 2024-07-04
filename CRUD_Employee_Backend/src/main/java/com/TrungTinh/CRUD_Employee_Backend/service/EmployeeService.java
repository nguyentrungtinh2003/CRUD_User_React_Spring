package com.TrungTinh.CRUD_Employee_Backend.service;

import com.TrungTinh.CRUD_Employee_Backend.entity.Employee;
import com.TrungTinh.CRUD_Employee_Backend.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Configuration
public interface EmployeeService {

    List<Employee> getAllUser();
    Employee getUserById(Long id);
    Employee createUser(Employee employee);
    Employee updateUser(Long id,Employee employee);
    Employee deleteUser(Long id);

}
