package com.thirty.spring.dao;

import com.thirty.spring.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-20 17:15
 * @ClassName UserDaoImpl
 * @description: 用户Dao实现类
 */
@Repository
public class UserDaoImpl {

    public UserDaoImpl() {

    }

    /**
     * 查找用户列表
     *
     * @return List<User>
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("thirty", 18));
    }
}