package org.ztk.dao;

import org.ztk.entity.Grade;

import java.util.List;

public interface GradeDao {

    //一对一        从stu的角度，一个stu对应一个garde.gid
    //一对多       从grade的角度，一个grade对应多个stu
    public List<Grade> getStuAndGrade();
}
