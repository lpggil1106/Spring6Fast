package com.dylan.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUserObject(){
        //加載spring配置
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User) ctx.getBean("user");
        System.out.println(user);
        user.add();
    }
}
