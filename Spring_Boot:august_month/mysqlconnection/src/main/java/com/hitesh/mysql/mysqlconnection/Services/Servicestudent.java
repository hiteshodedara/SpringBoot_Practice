package com.hitesh.mysql.mysqlconnection.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hitesh.mysql.mysqlconnection.Repo.studentrepo;
import com.hitesh.mysql.mysqlconnection.Students.Student;

@Service
public class Servicestudent {
    @Autowired
    private studentrepo studentrepo;

    public Student saveDetail(Student student){
        return studentrepo.save(student);
    }

    public List<Student> getallstudent(){
        return studentrepo.findAll();
    }
}
