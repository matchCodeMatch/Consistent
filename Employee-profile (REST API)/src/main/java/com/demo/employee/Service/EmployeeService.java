package com.demo.employee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.demo.employee.Model.Employee;
import com.demo.employee.repository.EmployeeRepository;
import java.util.Optional;
@Service
public class EmployeeService implements Services {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> showAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public Employee showEmployeeById(long id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        Employee currentEmployee = optionalEmployee.get();
//                    .orElseThrow(() -> new NullPointerException("Employee not found with id " + id));
        return currentEmployee;
    }
    @Override
    public void updateEmployee(long id, Employee employee) {
        Employee oldEmployee = showEmployeeById(id);
        oldEmployee.setFirstName(employee.getFirstName());
        oldEmployee.setLastName(employee.getLastName());
        oldEmployee.setDob(employee.getDob());
        oldEmployee.setGender(employee.getGender());
        oldEmployee.setEmail(employee.getEmail());
        oldEmployee.setHireDate(employee.getHireDate());
        oldEmployee.setSalary(employee.getSalary());
        employeeRepository.save(oldEmployee);
    }
    @Override
    public void patchEmployee(long id, Employee employee) {
        Employee oldEmployee = showEmployeeById(id);
        if (employee.getFirstName() != null)
            oldEmployee.setFirstName(employee.getFirstName());
        if (employee.getLastName() != null)
            oldEmployee.setLastName(employee.getLastName());
        if (employee.getDob() != null)
            oldEmployee.setDob(employee.getDob());
        if (employee.getGender() != null)
            oldEmployee.setGender(employee.getGender());
        if (employee.getEmail() != null)
            oldEmployee.setEmail(employee.getEmail());
        if (employee.getHireDate() != null)
            oldEmployee.setHireDate(employee.getHireDate());
        if (employee.getSalary() != null)
            oldEmployee.setSalary(employee.getSalary());
        employeeRepository.save(oldEmployee);
    }
    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}