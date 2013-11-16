package cc.crappie.mapper;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtil {
    private static SqlSessionFactory factory;
    private MyBatisUtil() {
    }

    public static final String MYBATIS_CONFIG_XML = "mybatis.config.xml";

    static {
        initSessionFactories(MYBATIS_CONFIG_XML, "development");
    }
    public static void initSessionFactories(String configFile, String environment){
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(configFile);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        factory = new SqlSessionFactoryBuilder().build(reader, environment);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return factory;
    }

    public static void initSessionFactory(String environment){
        initSessionFactories(MYBATIS_CONFIG_XML, environment);
    }


    public static SqlSessionFactory getSqlSessionFactory(String environment){
        initSessionFactories(MYBATIS_CONFIG_XML, environment);
        return factory;
    }
}