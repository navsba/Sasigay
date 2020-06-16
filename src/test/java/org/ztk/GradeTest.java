package org.ztk;

import org.junit.Test;
import org.ztk.dao.GradeDao;
import org.ztk.entity.Grade;
import org.ztk.utils.MybatisUtil;

import java.util.List;

public class GradeTest {

    @Test
    public void getStuAndGradeTest() {
        GradeDao gradeDao = MybatisUtil.getMapper(GradeDao.class);
        List<Grade> sag = gradeDao.getStuAndGrade();
        System.out.println(sag);
        MybatisUtil.close();
    }
}
