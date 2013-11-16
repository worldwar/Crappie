package cc.crappie.mapper;

import cc.crappie.entity.Article;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper {

    @Select(
            "SELECT id, author_id, time, title, content FROM article"
    )
    @Results(value = {
            @Result(property = "id"),
            @Result(property = "authorId", column = "author_id"),
            @Result(property = "time"),
            @Result(property = "title"),
            @Result(property = "content")
    })
    public List<Article> retrieve(Long authorId);
}
