package com.wujc.springtest.dao.impl;

import com.wujc.springtest.dao.UserDao;
import com.wujc.springtest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 * @author wujc
 * @ClassName UserDaoImpl
 * @Description: TODO
 * @create 2018-12-15 11:53
 */
@Component
public class UserDaoImpl  implements UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public User findUserByUserName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }
}
