package cc.crappie.mapper;

import cc.crappie.entity.Author;
import org.apache.ibatis.annotations.*;

import java.util.List;
public interface AuthorMapper {
    @Select(
            "SELECT name FROM author"
    )
    @Results(value = {
            @Result(property="name")
    })
    public List<Author> all();

    @Insert(
            "INSERT INTO author(email, name, password) VALUES(#{email}, #{name}, #{password})"
    )
    @Options(keyProperty = "id", useGeneratedKeys = true)
    public Integer insert(Author author);
}
