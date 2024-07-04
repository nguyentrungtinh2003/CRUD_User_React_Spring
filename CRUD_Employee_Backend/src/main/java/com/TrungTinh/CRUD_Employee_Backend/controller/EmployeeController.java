package com.TrungTinh.CRUD_Employee_Backend.controller;

import com.TrungTinh.CRUD_Employee_Backend.entity.Employee;
import com.TrungTinh.CRUD_Employee_Backend.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

@GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllUser() {
    List<Employee> allUser = employeeService.getAllUser();
    return ResponseEntity.ok(allUser);
}

@GetMapping("/{id}")
    public Employee getUserById(@PathVariable Long id) {
    return employeeService.getUserById(id);
}

@PostMapping("/add")
    public Employee createUser(@RequestBody Employee employee) {
    return employeeService.createUser(employee);
}

@PutMapping("/update/{id}")
    public Employee updateUser(@PathVariable Long id,@RequestBody Employee employee) {
    return employeeService.updateUser(id,employee);
}

@DeleteMapping("/delete/{id}")
    public Employee deleteUser(@PathVariable Long id) {
    return employeeService.deleteUser(id);
}

}
