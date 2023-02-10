package com.demo.employee.Service;

import java.util.List;
import com.demo.employee.Model.Employee;
public interface Services {
    Employee addEmployee(Employee employee);
    void deleteEmployee(long id);
    Employee patchEmployee(long id, Employee employee);
    List<Employee> showAllEmployees();
    Employee showEmployeeById(long id);
}

