package com.demo.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.demo.employee.Model.Employee;
import com.demo.employee.Service.EmployeeService;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService ;
    //----------------------------------Showing All Employee details.-------------------------------
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employeeList= employeeService.showAllEmployees();
        if(employeeList.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity(employeeList, HttpStatus.OK);
    }
    //----------------------------------Showing the employee with ID--------------------------------
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id){
        return new ResponseEntity<>(employeeService.showEmployeeById(id),HttpStatus.OK);
    }
    //------------------------------------To add an employee-----------------------------------
    @PostMapping
    public ResponseEntity addEmployee(@RequestBody @Valid Employee employee){
        if(!employee.getHireDate().isAfter(employee.getDob()))
            return new ResponseEntity<>("Hire date is not logically correct.",HttpStatus.BAD_REQUEST);
        return new ResponseEntity(employeeService.addEmployee(employee),HttpStatus.CREATED);
    }
    //-------------------------------To update the Employee detail-------------------------------
    @PutMapping("/{id}")
    public ResponseEntity updateEmployee(@RequestBody @Valid Employee employee,@PathVariable long id){
        if(!employee.getHireDate().isAfter(employee.getDob()))
            return new ResponseEntity<>("Hire date is not logically correct.",HttpStatus.BAD_REQUEST);
        return new ResponseEntity(employeeService.patchEmployee(id,employee),HttpStatus.OK);
    }
    //-----------------------------------To patch the employee-----------------------------------
    @PatchMapping("/{id}")
    public ResponseEntity patchEmployee(@PathVariable long id,@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.patchEmployee(id,employee),HttpStatus.OK);
    }
    //---------------------------------To delete an employee by ID------------------------------------
    @DeleteMapping("/{id}")
    public ResponseEntity deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>("Deleted.",HttpStatus.NO_CONTENT);
    }
}

