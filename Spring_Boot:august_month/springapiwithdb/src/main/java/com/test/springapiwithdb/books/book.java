package com.test.springapiwithdb.books;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Table(name="booktable1")
@NoArgsConstructor
@AllArgsConstructor
public class book {
  
    @id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("id")
    private int id;
    @Column("title")
    private String title;
    @Column("author")
    private String author;

    
}
