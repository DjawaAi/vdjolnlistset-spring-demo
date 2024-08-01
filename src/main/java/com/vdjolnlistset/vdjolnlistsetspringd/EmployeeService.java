package com.vdjolnlistset.vdjolnlistsetspringd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public static List<Employee> employees = new ArrayList<>(List.of());
    public static final int maxNumber = 5;

    public static Object employAdd(String name, String secondName) {
        Employee employee = new Employee(name, secondName);
        if (maxNumber > employees.size()) {
            if (employees.contains(employee)) {
                return new EmployeeAlreadyAddedException();
            } else {
                employees.add(employee);
                return String.valueOf(employee);
            }
        } else {
            return new EmployeeStorageIsFullException();
        }
    }

    public static Object employRem(String name, String secondName) {
        Employee employee = new Employee(name, secondName);
        if (employees.contains(employee)) {
            employees.remove(employee);
            return "Удален из списка " + employee;
        } else {
            return new EmployeeNotFoundException();
        }
    }

    public static Object employFind(String name, String secondName) {
        Employee employee = new Employee(name, secondName);
        if (employees.contains(employee)) {
            return "Сотрудник " + employee + "в список найден";
        } else {
            return new EmployeeNotFoundException();
        }
    }
}