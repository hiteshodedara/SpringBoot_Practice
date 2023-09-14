package com.hitesh.jpa.bookswithmysql.Books;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_list")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class book {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
}
