package org.ztk;

import org.junit.Test;
import org.ztk.dao.UserDao;
import org.ztk.entity.User;
import org.ztk.utils.MybatisUtil;

public class UserTest {

    @Test
    public void addUserTest() {
        UserDao userDao = MybatisUtil.getMapper(UserDao.class);
        userDao.insertUser(new User(null, "郭靖"));
        MybatisUtil.commit();
    }
}
