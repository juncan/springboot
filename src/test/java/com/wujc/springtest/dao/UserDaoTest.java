package com.wujc.springtest.dao;

import com.wujc.springtest.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author wujc
 * @ClassName UserDaoTest
 * @Description: TODO
 * @create 2018-12-15 11:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void saveUser() {
        User user = new User();
        user.setId(2l);
        user.setUserName("小米");
        user.setPassWord("123456");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName() {
        User user = userDao.findUserByUserName("小米");
        System.out.println("user is" + user);
    }
}