package com.example.springthymleafpartone.service;

import com.example.springthymleafpartone.model.Article;

import java.util.List;

public interface ArticleService {
   List<Article> getAllArticles();
   Article geArticleByID(int id);
   void addNewArticle(Article article);

}
