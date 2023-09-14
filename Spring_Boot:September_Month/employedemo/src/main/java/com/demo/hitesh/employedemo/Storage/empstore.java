package com.demo.hitesh.employedemo.Storage;

import com.demo.hitesh.employedemo.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class empstore {
    private List<Employee> employeeList;

    // Method to return the list
    // of employees
    public List<Employee> getEmployeeList()
    {

        if (employeeList == null) {

            employeeList
                    = new ArrayList<>();


        }

        return employeeList;


    }

    public void
    setEmployeeList(
            List<Employee> employeeList)
    {
        this.employeeList
                = employeeList;
    }
}
