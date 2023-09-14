package com.hitesh.jpa.bookswithmysql.BookRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hitesh.jpa.bookswithmysql.Books.book;

public interface bookrepo extends JpaRepository<book,Integer> {
     
}
