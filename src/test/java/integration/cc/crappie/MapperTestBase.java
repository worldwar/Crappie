package integration.cc.crappie;

import cc.crappie.mapper.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

public abstract class MapperTestBase {

    private SqlSession sqlSession;

    @Before
    public void setup() throws Exception{
        MyBatisUtil.initSessionFactory("test");
        sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
    }

    @After
    public void tearDown(){
        sqlSession.rollback();
        sqlSession.close();
    }

    public SqlSession getSqlSession(){
        return sqlSession;
    }
}
