package org.ztk.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory factory;
    private static final ThreadLocal<SqlSession> SQL_SESSION_THREAD_LOCAL = new ThreadLocal<SqlSession>();
    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = SQL_SESSION_THREAD_LOCAL.get();
        if(sqlSession == null) {
            sqlSession = factory.openSession();
            SQL_SESSION_THREAD_LOCAL.set(sqlSession);
        }
        return sqlSession;
    }

    public static void close() {
        getSqlSession().close();
        SQL_SESSION_THREAD_LOCAL.remove();
    }

    public static void commit() {
        getSqlSession().commit();
        close();
    }

    public static void rollback() {
        getSqlSession().rollback();
        close();
    }

    public static  <T> T getMapper(Class<T> tClass) {
        SqlSession session = getSqlSession();
        return session.getMapper(tClass);
    }
}
