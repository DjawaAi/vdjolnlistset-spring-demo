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
    public Object employAdd(@RequestParam(value = "firstName") String name, @RequestParam(value = "lastName") String secondName) {
        return EmployeeService.employAdd(name, secondName);
    }


    @GetMapping(path = "/remove")
    public Object employRem(@RequestParam(value = "firstName") String name, @RequestParam(value = "lastName") String secondName) {
        return EmployeeService.employRem(name, secondName);
    }

    @GetMapping(path = "/find")
    public Object employFind(@RequestParam(value = "firstName") String name, @RequestParam(value = "lastName") String secondName) {
        return EmployeeService.employFind(name, secondName);
    }
}



