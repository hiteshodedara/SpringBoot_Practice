package com.test.springapi.services;

import com.test.springapi.books.book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class bookservice {
    private static List<book> list =new ArrayList<>();

    static {
        list.add(new book(1,"java","hit1"));
        list.add(new book(2,"python","hit2"));
        list.add(new book(3,"javaEE","hit3"));
    }
    public List<book>getbooks(){
        return list;
    }
    public book addbook(book b){
        list.add(b);
        return b;
    }
    public void deletebook(int id){
        list=list.stream().filter(book ->book.getId()!=id).collect(Collectors.toList());

    }

    public book updatebook(book book,int id){
        list=list.stream().map(b->{
            if(b.getId()==id){
                b.setAuthor(book.getAuthor());
                b.setTitle(book.getTitle());
            }
            return b;
        }).collect(Collectors.toList());
        return book;
    }
}
