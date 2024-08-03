package com.vdjolnlistset.vdjolnlistsetspringd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/add")
    public Employee employAdd(@RequestParam(value = "firstName", required = false) String name, @RequestParam(value = "lastName", required = false) String secondName) {
        return employeeService.employAdd(name, secondName); //new EmployeeService().employAdd(name, secondName);//EmployeeService.employAdd(name, secondName);
    }


    @GetMapping(path = "/remove")
    public Employee employRem(@RequestParam(value = "firstName", required = false) String name, @RequestParam(value = "lastName", required = false) String secondName) {
        return employeeService.employRem(name, secondName);
    }

    @GetMapping(path = "/find")
    public Employee employFind(@RequestParam(value = "firstName", required = false) String name, @RequestParam(value = "lastName", required = false) String secondName) {
        return employeeService.employFind(name, secondName);
    }
}



