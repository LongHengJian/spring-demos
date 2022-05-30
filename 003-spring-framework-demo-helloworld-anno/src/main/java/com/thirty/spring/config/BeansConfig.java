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

}
