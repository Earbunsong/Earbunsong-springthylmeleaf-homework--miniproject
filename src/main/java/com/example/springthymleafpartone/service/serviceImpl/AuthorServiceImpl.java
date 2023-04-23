package com.example.springthymleafpartone.service.serviceImpl;

import com.example.springthymleafpartone.model.Author;
import com.example.springthymleafpartone.repository.AuthorRepository;
import com.example.springthymleafpartone.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements AuthorService {
    //authorRepository
    private AuthorRepository authorRepository;
    AuthorServiceImpl(){
        authorRepository =  new AuthorRepository();
    }
    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.getAllAuthors();
    }
}
