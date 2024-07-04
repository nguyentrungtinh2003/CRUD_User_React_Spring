package com.TrungTinh.CRUD_Employee_Backend.service;

import com.TrungTinh.CRUD_Employee_Backend.entity.Employee;
import com.TrungTinh.CRUD_Employee_Backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllUser() {
        return employeeRepository.findAll();
    }

    public Employee getUserById(Long id) {
        return employeeRepository.findById(id).orElseThrow(null);
    }

    public Employee createUser(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateUser(Long id,Employee employee) {
        Employee epe = employeeRepository.findById(id).orElseThrow(null);

        epe.setName(employee.getName());
        epe.setPhone(employee.getPhone());
        epe.setPhone(employee.getPhone());
        epe.setEmail(employee.getEmail());

        employeeRepository.save(epe);
        return epe;
    }

    public Employee deleteUser(Long id) {
      Employee epe = employeeRepository.findById(id).orElseThrow(null);

      employeeRepository.deleteById(id);
      return epe;
    }




}
