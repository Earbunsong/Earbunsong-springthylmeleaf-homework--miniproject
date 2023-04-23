package com.example.springthymleafpartone.controller;

import com.example.springthymleafpartone.model.Article;
import com.example.springthymleafpartone.model.request.ArticleRequest;
import com.example.springthymleafpartone.repository.ArticleRepository;
import com.example.springthymleafpartone.service.ArticleService;
import com.example.springthymleafpartone.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    //3
    //1. Constructor injection
    //2. Field injection
    //3. Setter injection

    ArticleService articleService;
    AuthorService authorService;
//@Autowired
//    public void setArticleService(ArticleService articleService) {
//        this.articleService = articleService;
//    }
//@Autowired
//    public void setAuthorService(AuthorService authorService) {
//        this.authorService = authorService;
//    }

    @Autowired
    ArticleController(ArticleService articleService
            ,AuthorService authorService){
        this.articleService = articleService;
        this.authorService  = authorService;
    }


   @GetMapping("/all-article")
    public String getAllArticle(Model model){
        model.addAttribute("allArticle",articleService.getAllArticles());
        return "all-article";
    }
    @GetMapping("/post/{postID}")
    public String getPostByID(@PathVariable int postID ,Model model){
        model.addAttribute("article",articleService.geArticleByID(postID));
        return "viewArticle";
    }
    @GetMapping("/form-add-article")
    public String getFormAdd(Model model){
        model.addAttribute("article",new ArticleRequest());
        model.addAttribute("authors",new getAllAuthors() );
        return "new-article";
    }
    @PostMapping("/handleAddArticle")
    public  String handleAddArticle(@ModelAttribute("article") ArticleRequest article){
        System.out.println("Here is the value of article :"+article);


        // mapstruct vs model mapper
        Article newArticle = new Article();
        newArticle.setTitle(article.getTitle());
//        articleService.addNewArticle(article);
        return "redirect:/";
    }

    private record getAllAuthors() {
    }
}
