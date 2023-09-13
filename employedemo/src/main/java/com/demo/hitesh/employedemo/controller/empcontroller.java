package com.demo.hitesh.employedemo.controller;

import com.demo.hitesh.employedemo.Storage.EmployeeDAO;
import com.demo.hitesh.employedemo.Storage.empstore;
import com.demo.hitesh.employedemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;

@RestController
@RequestMapping(path = "/employees")
public class empcontroller {



        @Autowired
        private EmployeeDAO employeeDao;

        // Implementing a GET method
        // to get the list of all
        // the employees
        @GetMapping(
                path = "/",
                produces = "application/json")
        public empstore getEmployees()
        {
            return employeeDao.getAllEmployees();
        }
        @GetMapping("/{id}")
        public Employee getineemp(@PathVariable("id") int id){
            Employee e;
            try {
                 e = employeeDao.getonemploye((id - 1));
            }catch (Exception error){
                System.out.println("error");
                return null;
            }
            return e;
        }

        // Create a POST method
        // to add an employee
        // to the list
        @PostMapping(
                path = "/",
                consumes = "application/json",
                produces = "application/json")

        public String  addEmployee(
                @RequestBody Employee employee)
        {

            // Creating an ID of an employee
            // from the number of employees
            Integer id
                    = employeeDao
                    .getAllEmployees()
                    .getEmployeeList()
                    .size()
                    + 1;

            employee.setId(id);

            employeeDao
                    .addEmployee(employee);

            URI location
                    = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(
                            employee.getId())
                    .toUri();

             ResponseEntity
                    .created(location)
                    .build();
            System.out.println("new user added...");
             return "success";
        }
}
