package com.example.springthymleafpartone.repository;

import com.example.springthymleafpartone.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    List<Author> authors = new ArrayList<>(){{
        add(new Author(1001,"jamesong","male","song smos snhea"));
        add(new Author(1002,"jamesong","male","song smos snhea"));add(new Author(1001,"jamesong","male","song smos snhea"));
        add(new Author(1003,"jamesong","male","song smos snhea"));add(new Author(1001,"jamesong","male","song smos snhea"));
        add(new Author(1004,"jamesong","male","song smos snhea"));
    }};
    public List<Author> getAllAuthors(){
        return authors;
    }
    //create
    //update
    //search............
}
