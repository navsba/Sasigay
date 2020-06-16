package org.ztk.dao;

import org.apache.ibatis.annotations.Param;
import org.ztk.entity.Stu;
import org.ztk.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public int insertUser(User user);
}
