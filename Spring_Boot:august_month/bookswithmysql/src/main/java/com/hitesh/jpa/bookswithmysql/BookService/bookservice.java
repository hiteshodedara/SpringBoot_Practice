package com.hitesh.jpa.bookswithmysql.BookService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hitesh.jpa.bookswithmysql.BookRepo.bookrepo;
import com.hitesh.jpa.bookswithmysql.Books.book;

@Service
public class bookservice {
    @Autowired
    private bookrepo bookrepo;

    public book saveDetail(book book){
        return bookrepo.save(book);
    }

    public String updetebook(int id,book book){
        boolean bool=bookrepo.existsById(id);
        if(bool==true)
        {
        bookrepo.save(book);
        return "updeted";
        }
         return "not Updeted";
    }

    public List<book> getallbooks(){

        return (List<book>) bookrepo.findAll();
    }

    public Optional<book> getbook(int id){

        return bookrepo.findById(id);
    }

    public String deleteDetail(int id){
        bookrepo.deleteById(id);
        return "deleted..";
    }
    public String deleteDetailall(){
        bookrepo.deleteAll();
        return "deleted..";
    }
}
