package com.demo.hitesh.employedemo.Storage;

import com.demo.hitesh.employedemo.entity.Employee;
import org.springframework
        .stereotype
        .Repository;

// Importing the employees class to
// use the defined properties
// in this class


@Repository

// Class to create a list
// of employees
public class EmployeeDAO {

    private static final empstore list
            = new empstore();

    // This static block is executed
    // before executing the main
    // block
    static
    {

        // Creating a few employees
        // and adding them to the list
        list.getEmployeeList().add(
                new Employee(
                        1,
                        "Prem",
                        "Tiwari",
                        "chapradreams@gmail.com"));

        list.getEmployeeList().add(
                new Employee(
                        2, "Vikash",
                        "Kumar",
                        "abc@gmail.com"));

        list.getEmployeeList().add(
                new Employee(
                        3, "Ritesh",
                        "Ojha",
                        "asdjf@gmail.com"));


    }

    // Method to return the list
    public empstore getAllEmployees()
    {

        return list;
    }
    public Employee getonemploye(int id){
        Employee e=list.getEmployeeList().get(id);
        return e;
    }

    // Method to add an employee
    // to the employees list
    public void
    addEmployee(Employee employee)
    {
        list.getEmployeeList()
                .add(employee);

    }

}