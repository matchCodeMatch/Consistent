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
@RequestMapping("/index")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService ;

    //----------------------------------Showing All Employee details.-------------------------------
    @GetMapping("/allEmployee")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employeeList= employeeService.showAllEmployees();
        if(employeeList.isEmpty())
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        return new ResponseEntity(employeeList, HttpStatus.OK);
    }
    //----------------------------------Showing the employee with ID--------------------------------
    @GetMapping("/employeeById")
    public ResponseEntity<Employee> getEmployeeById(@RequestParam long id){
        return new ResponseEntity<>(employeeService.showEmployeeById(id),HttpStatus.OK);
    }
    //------------------------------------To add an employee-----------------------------------
    @PostMapping("/addEmployee")
    public ResponseEntity addEmployee(@RequestBody @Valid Employee employee){
        if(!employee.getHireDate().isAfter(employee.getDob()))
            return new ResponseEntity<>("Hire date is not logically correct.",HttpStatus.BAD_REQUEST);
        employeeService.addEmployee(employee);
        return new ResponseEntity("Employee added Successfully.",HttpStatus.CREATED);
    }
    //-------------------------------To update the Employee detail-------------------------------
    @PutMapping("/updateEmployee")
    public ResponseEntity updateEmployee(@RequestBody @Valid Employee employee,@RequestParam long id){
        if(!employee.getHireDate().isAfter(employee.getDob()))
            return new ResponseEntity<>("Hire date is not logically correct.",HttpStatus.BAD_REQUEST);
        employeeService.updateEmployee(id,employee);
        return new ResponseEntity("Updated Successfully",HttpStatus.CREATED);
    }
    //-----------------------------------To patch the employee-----------------------------------
    @PatchMapping("/patchEmployee")
    public ResponseEntity patchEmployee(@RequestBody @Valid Employee employee,@RequestParam long id){
        if(!employee.getHireDate().isAfter(employee.getDob()))
            return new ResponseEntity<>("Hire date is not logically correct.",HttpStatus.BAD_REQUEST);
        employeeService.patchEmployee(id,employee);
        return new ResponseEntity<>("Updated Successfully",HttpStatus.CREATED);
    }
    //---------------------------------To delete an employee by ID------------------------------------
    @DeleteMapping("/deleteEmployee")
    public void deleteEmployee(@RequestParam long id){
        employeeService.deleteEmployee(id);
    }
}

