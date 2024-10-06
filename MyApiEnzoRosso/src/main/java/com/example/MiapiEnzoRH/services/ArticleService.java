package com.example.MiapiEnzoRH.services;

import com.example.MiapiEnzoRH.entities.Article;
import com.example.MiapiEnzoRH.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService extends BaseService<Article, Long>{
    public ArticleService(ArticleRepository articleRepository) {
        super(articleRepository);
    }
}
