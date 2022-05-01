package com.example.demo1.controller;

import com.example.demo1.model.Employee;
import com.example.demo1.reponsitory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @RequestMapping(value = "/")
    public String viewAllEmployee(Model model)
    {

        List<Employee> employeeList = employeeRepository.findAll();
       model.addAttribute("employees", employeeList);
        return "employeeList";
    }
    @RequestMapping( value = "/{id}")
    public String getDetail(
            @PathVariable (value = "id") Long id, Model model)
    {
        Employee employee = employeeRepository.getById(id);
        model.addAttribute("employee", employee);
                return "employeeDetail";
    }

}
