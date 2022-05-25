package com.thirty.spring.config;

import com.thirty.spring.aspect.LogAspect;
import com.thirty.spring.dao.UserDaoImpl;
import com.thirty.spring.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 龙恒建
 * @Email longhengjian@utry.cn
 * @date 2022-05-25 17:13
 * @ClassName BeansConfig
 * @description: Bean配置类
 */

@EnableAspectJAutoProxy
@Configuration
public class BeansConfig {

    /**
     * 用户Dao的Bean对象生成
     * @return 一个UserDaoImpl对象
     */
    @Bean("userDao")
    public UserDaoImpl userDao() {
        return new UserDaoImpl();
    }

    /**
     * 用户服务Service的Bean对象生成
     * @return 一个UserServiceImpl对象
     */
    @Bean("userService")
    public UserServiceImpl userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    /**
     * 日志切面
     * @return 日志切面对象
     */
    @Bean("logAspect")
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
