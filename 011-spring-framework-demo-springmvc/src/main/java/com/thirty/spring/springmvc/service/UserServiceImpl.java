package com.thirty.spring.springmvc.service;

import com.thirty.spring.springmvc.dao.UserDaoImpl;
import com.thirty.spring.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-24 17:22
 * @ClassName UserServiceImpl
 * @description: User服务实现类
 */
@Service
public class UserServiceImpl {

    /**
     * user Dao 实现类
     */
    @Autowired
    private UserDaoImpl userDao;

    /**
     * 查询用户列表方法
     * @return List<User>
     */
    public List<User> findUserList() {
        return this.userDao.findUserList();
    }

}