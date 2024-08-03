package com.vdjolnlistset.vdjolnlistsetspringd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public final int maxNumber = 5;
    public List<Employee> employees = new ArrayList<>(List.of());

    public Employee employAdd(String name, String secondName) {
        Employee employee = new Employee(name, secondName);
        if (maxNumber > employees.size()) {
            if (employees.contains(employee)) {
                throw new EmployeeAlreadyAddedException("EmployeeAlreadyAddedException");
            } else {
                employees.add(employee);
                //return String.valueOf(employee);
                return employee;
            }
        } else {
            throw new EmployeeStorageIsFullException();
        }
    }

    public Employee employRem(String name, String secondName) {
        Employee employee = new Employee(name, secondName);
        if (employees.contains(employee)) {
            employees.remove(employee);
            return employee;
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    public Employee employFind(String name, String secondName) {
        Employee employee = new Employee(name, secondName);
        if (employees.contains(employee)) {
            return employee;
        } else {
            throw new EmployeeNotFoundException();
        }
    }
}