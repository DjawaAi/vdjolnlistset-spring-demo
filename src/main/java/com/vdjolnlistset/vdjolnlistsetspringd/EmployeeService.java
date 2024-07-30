package com.vdjolnlistset.vdjolnlistsetspringd;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> employees;


    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public static void employAdd(List<Employee> employees) {
        final int maxNumber = 5;
        if (maxNumber >= employees.size()) {
            if (employees.contains((Employee) employees)) {
                throw new EmployeeAlreadyAddedException();
            } else {
                employees.add((Employee) employees);
            }
        } else {
            throw new EmployeeStorageIsFullException();
        }
    }

    public static void employRem(List<Employee> employees) {
        if (employees.contains((Employee) employees)) {
            employees.remove((Employee) employees);
        } else {
            throw new EmployeeNotFoundException();
        }

    }

    public static String employFind(List<Employee> employees) {
        if (employees.contains((Employee) employees)) {
            return "Сотрудник с таким имененм и фамилией существует в этом списке";
        } else {
            throw new EmployeeNotFoundException();
        }
    }
}