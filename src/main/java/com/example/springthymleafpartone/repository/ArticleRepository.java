package com.example.springthymleafpartone.repository;
import com.example.springthymleafpartone.model.Article;
import com.example.springthymleafpartone.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>(){{
        add(new Article(1100,"ChatGPT","new elolution of prompt programming",
                "https://i.pinimg.com/236x/9c/f5/b1/9cf5b13178ed40bee00817449053b0cd.jpg",new AuthorRepository().getAllAuthors().get(0)));
        add(new Article(1101,"Css","new elolution of prompt programming",
                "https://i.pinimg.com/236x/76/82/a6/7682a64c4fdbbebb8d63c92cc2c76d19.jpg",new AuthorRepository().getAllAuthors().get(0)));
        add(new Article(1102,"HTML","new elolution of prompt programming",
                "https://i.pinimg.com/236x/69/df/3a/69df3a778bc0ecb28f689131e756838b.jpg",new AuthorRepository().getAllAuthors().get(0)));
        add(new Article(1103,"BOOTSTRAP","new elolution of prompt programming",
                "https://i.pinimg.com/236x/44/a6/15/44a6152e316bc19eb6d6d8012fb0511b.jpg",new AuthorRepository().getAllAuthors().get(0)));
        add(new Article(1104,"REACT","new elolution of prompt programming",
                "https://i.pinimg.com/236x/c0/ea/5c/c0ea5ceb395821f7f9714a7e8096cded.jpg",new AuthorRepository().getAllAuthors().get(0)));
        add(new Article(1105,"ChatGPT","new elolution of prompt programming",
                "https://i.pinimg.com/236x/fe/e3/25/fee32592e55ac13f0b1393f0123829a4.jpg",new AuthorRepository().getAllAuthors().get(0)));
    }};
    public List<Article> getArticleList(){
        return articleList;
    }
    public Article geArticleByID(int id){
        return articleList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
    }
    public void addNewArticle(Article article){
        articleList.add(article);
    }
}
