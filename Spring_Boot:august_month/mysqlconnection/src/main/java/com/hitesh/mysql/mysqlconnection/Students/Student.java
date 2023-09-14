package com.hitesh.mysql.mysqlconnection.Students;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="STUDENT_List")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "Id")
    @GeneratedValue
    private int id;
    @Column(name = "Mark")
    private int mark;
    @Column(name = "Name")
    private String name;

    
}
