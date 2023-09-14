package com.test.springapi.controller;

//import org.springframework.stereotype.Controller;
import com.test.springapi.books.book;
import com.test.springapi.services.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class bookcontroller {

    @Autowired
    private bookservice bookservice;

    @GetMapping(path = "/books")
    public ResponseEntity<List<book>> test(){
        List<book> list=bookservice.getbooks();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }

    @PostMapping(path = "/books")
    public book addbook(@RequestBody book book){
        this.bookservice.addbook(book);
        return book;
    }

    @DeleteMapping(path = "/books/{id}")
    public String deletebook(@PathVariable("id")int bid){
        this.bookservice.deletebook(bid);
        return bid+"deleted";
    }

    @PutMapping(path = "/books/{id}")
    public book updatebook(@RequestBody book book,@PathVariable("id")int id){
        this.bookservice.updatebook(book,id);
        return book;
    }



}
