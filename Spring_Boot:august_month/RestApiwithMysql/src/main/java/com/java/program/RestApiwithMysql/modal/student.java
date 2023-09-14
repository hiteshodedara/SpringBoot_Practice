package com.java.program.RestApiwithMysql.modal;

import jakarta.persistence.*;

@Entity

public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRollnum() {
        return rollnum;
    }

    public void setRollnum(Integer rollnum) {
        this.rollnum = rollnum;
    }

    private String email;
    private Integer rollnum;
}
