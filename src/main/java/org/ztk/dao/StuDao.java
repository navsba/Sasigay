package org.ztk.dao;

import org.apache.ibatis.annotations.Param;
import org.ztk.entity.Stu;

import java.util.List;
import java.util.Map;

public interface StuDao {
    public List<Stu> getAllStu();

    public List<Stu> getStuByName(String name);

    public Stu getStuByNameAndId(@Param("stuname") String name, @Param("stuid") int id);

    public List<Stu> getStuByFuzzyQuery(String name);

    public List<Stu> getStuByPage(Map map);

    public int insertStu(Stu stu);

    //多对多       stu 和 course 多对多， 需要引入   中间表t_stu_course
    //            来转换两张表的一对多的关系
    public List<Stu> getStuAndCourseAndMidleIntermediateTable();

}
