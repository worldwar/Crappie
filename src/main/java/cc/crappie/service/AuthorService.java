package cc.crappie.service;

import cc.crappie.entity.Author;
import cc.crappie.mapper.AuthorMapper;
import cc.crappie.mapper.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AuthorService {

    private final SqlSession session;
    private final AuthorMapper authorMapper;

    public AuthorService(){
        session = MyBatisUtil.getSqlSessionFactory().openSession();
        authorMapper = session.getMapper(AuthorMapper.class);
    }

    public List<Author> retrieve(){
        List<Author> results = authorMapper.all();
        return results;
    }

    public void insert(Author author){
        authorMapper.insert(author);
        session.commit();
    }
}
