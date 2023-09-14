package com.hitesh.mysql.mysqlconnection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hitesh.mysql.mysqlconnection.Services.Servicestudent;
import com.hitesh.mysql.mysqlconnection.Students.Student;

@RestController
public class studentcontroller {
    @Autowired
    private Servicestudent servicestudent;

    @PostMapping("/addstudent")
    public String postStudent(@RequestBody Student student){
        servicestudent.saveDetail(student);
        return "Posted";
    } 
    @GetMapping("/getstudent")
    public List<Student> getallstudent(){
        return servicestudent.getallstudent();
    }
    

}
