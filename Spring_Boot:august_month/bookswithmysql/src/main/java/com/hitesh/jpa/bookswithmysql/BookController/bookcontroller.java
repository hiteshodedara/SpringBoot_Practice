package com.hitesh.jpa.bookswithmysql.BookController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.hitesh.jpa.bookswithmysql.BookService.bookservice;
import com.hitesh.jpa.bookswithmysql.Books.book;


@RestController
public class bookcontroller {
    @Autowired
    private bookservice bookservice;

    @PostMapping("/addbooks")
    public String postbook(@RequestBody book book){
        bookservice.saveDetail(book);
        return "Posted";
    }
    @PutMapping("/updetebook/{id}")
    public String putbook(@PathVariable int id, @RequestBody book book){
        String ans=bookservice.updetebook(id,book);
        return ans;
    }
    @DeleteMapping("/deletebook/{id}")
    @ResponseBody
    public String deletebook(@PathVariable int id){
        bookservice.deleteDetail(id);
        return "Deleted";
    }
    @DeleteMapping("/deletebooks")
    public String deleteallbook(){
        bookservice.deleteDetailall();
        return "All Books Deleted";
    }

    @GetMapping("/getbooks")
    public List<book> getBooks(){
        return bookservice.getallbooks();
    }

    @GetMapping("/getbook/{id}")
    public Optional<book> getBooks(@PathVariable int id){
        return bookservice.getbook(id);
    }
}
