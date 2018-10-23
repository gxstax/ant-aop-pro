package com.ant.test;

import com.ant.config.AppConfig;
import com.ant.dao.impl.UserDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: Test
 * @Description: TODO
 * @datetime 2018/10/23 10:41
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext act = new AnnotationConfigApplicationContext(AppConfig.class);
        UserDaoImpl userDao = (UserDaoImpl) act.getBean("dao");
        userDao.query();
    }
}
