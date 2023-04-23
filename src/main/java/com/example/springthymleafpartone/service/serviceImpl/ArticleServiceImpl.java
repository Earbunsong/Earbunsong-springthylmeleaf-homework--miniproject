package com.example.springthymleafpartone.service.serviceImpl;

import com.example.springthymleafpartone.model.Article;
import com.example.springthymleafpartone.repository.ArticleRepository;
import com.example.springthymleafpartone.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    //need to call repository
    ArticleRepository articleRepository;
    ArticleServiceImpl(){
        articleRepository = new ArticleRepository();
    }
    @Override
    public List<Article> getAllArticles() {
        return articleRepository.getArticleList();
    }

    @Override
    public Article geArticleByID(int id) {
        return articleRepository.geArticleByID(id);
    }

    @Override
    public void addNewArticle(Article article) {
         articleRepository.addNewArticle(article);
    }
}
