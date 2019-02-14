package com.wujc.springtest.dao;

import com.wujc.springtest.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author wujc
 * @ClassName UserDao
 * @Description: TODO
 * @create 2018-12-15 11:50
 */
@Repository
public interface UserDao {
    public void saveUser(User user);

    public User findUserByUserName(String userName);
}
