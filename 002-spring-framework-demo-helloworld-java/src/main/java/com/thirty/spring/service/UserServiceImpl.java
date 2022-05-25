package com.thirty.spring.service;

import com.thirty.spring.dao.UserDaoImpl;
import com.thirty.spring.entity.User;

import java.util.List;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-24 17:22
 * @ClassName UserServiceImpl
 * @description: User服务实现类
 */
public class UserServiceImpl {

    /**
     * user Dao 实现类
     */
    private UserDaoImpl userDao;

    /**
     * 构造方法
     */
    public UserServiceImpl() {
    }

    /**
     * 查询用户列表方法
     * @return List<User>
     */
    public List<User> findUserList() {
        return this.userDao.findUserList();
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}