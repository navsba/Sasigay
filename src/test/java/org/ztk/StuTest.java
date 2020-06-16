package org.ztk;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.ztk.dao.StuDao;
import org.ztk.entity.Stu;
import org.ztk.utils.MybatisUtil;
import sun.reflect.generics.tree.VoidDescriptor;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StuTest {

    @Test
    public void selectAllStuTest() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        StuDao stuDao = sqlSession.getMapper(StuDao.class);
        List<Stu> allStu = stuDao.getAllStu();
        for(Stu stu : allStu) {
            System.out.println(stu);
        }
    }

    @Test
    public void selectStuByNameTest() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factor = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factor.openSession();
        StuDao stuDao = sqlSession.getMapper(StuDao.class);
        List<Stu> stu = stuDao.getStuByName("无天");
        for(Stu s : stu) {
            System.out.println(s);
        }
    }

    @Test
    public void selectStuByNameAndIdTest() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        StuDao stuDao = sqlSession.getMapper(StuDao.class);
        Stu stu = stuDao.getStuByNameAndId("王五", 23);
        System.out.println(stu);
    }

    @Test
    public void selectStuByFuzzyQueryTest() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = fac.openSession();
        StuDao stu = sqlSession.getMapper(StuDao.class);
        List<Stu> s = stu.getStuByFuzzyQuery("五");
        System.out.println(s);
    }

    @Test
    public void getStuByPageTest() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = fac.openSession();
        StuDao stuDao = sqlSession.getMapper(StuDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("begin", 4);
        map.put("end", 2);
        List<Stu> stu = stuDao.getStuByPage(map);
        System.out.println(stu);
    }

    @Test
    public void insertStu() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory fac = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = fac.openSession();
        StuDao stuDao = sqlSession.getMapper(StuDao.class);
        Stu stu = new Stu("小芳", new Date(System.currentTimeMillis()), "唱歌", 11, 2, "3305", null);
        int result = stuDao.insertStu(stu);
        sqlSession.commit();
        System.out.println(result);
        System.out.println(stu.getStuid());
    }


    @Test
    public void selectStuByFuzzyQueryTest2() throws Exception {
        StuDao stu = MybatisUtil.getMapper(StuDao.class);
        List<Stu> s = stu.getStuByFuzzyQuery("五");
        System.out.println(s);
    }

    @Test
    public void getStuAndGrade() throws Exception {
        StuDao stuDao = MybatisUtil.getMapper(StuDao.class);
        List<Stu> s = stuDao.getStuAndCourseAndMidleIntermediateTable();
        System.out.println(s);
        MybatisUtil.close();
    }
}
