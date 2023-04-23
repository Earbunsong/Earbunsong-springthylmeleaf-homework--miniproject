package com.example.springthymleafpartone.model.request;

import com.example.springthymleafpartone.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleRequest {

    private String title;
    private String description;
    private String imgUrl;
    private Author authorID;
}
