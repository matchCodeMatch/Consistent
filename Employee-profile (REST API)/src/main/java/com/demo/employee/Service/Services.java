package com.demo.employee.Service;

import java.util.List;
import com.demo.employee.Model.Employee;
public interface Services {
    Employee addEmployee(Employee employee);
    void deleteEmployee(long id);
    void patchEmployee(long id, Employee employee);
    List<Employee> showAllEmployees();
    Employee showEmployeeById(long id);
    void updateEmployee(long id , Employee employee);
}

