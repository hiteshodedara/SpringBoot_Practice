package com.hitesh.mysql.mysqlconnection.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitesh.mysql.mysqlconnection.Students.Student;

public interface studentrepo extends JpaRepository<Student,Integer>{

    
}
