package cc.crappie.service;

import cc.crappie.entity.Article;
import cc.crappie.mapper.ArticleMapper;
import cc.crappie.mapper.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ArticleService {

    public List<Article> retrieve(Long authorId){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
        List<Article> articles = articleMapper.retrieve(authorId);
        System.out.println(articles.get(0).getTitle());
        System.out.println(articles.get(0).getContent());
        session.close();
        return articles;
    }
}
