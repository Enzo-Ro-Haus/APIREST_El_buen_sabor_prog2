package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Article;
import com.example.MiapiEnzoRH.services.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Article")
public class ArticleController extends BaseController<Article, Long>{
    public ArticleController(ArticleService service) {
        super(service);
    }
}
