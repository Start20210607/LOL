package com.tx.test;


import com.tx.controller.HeroController;
import com.tx.pojo.Hero;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    //查找数据库所有英雄信息
    public void testFindAll(){

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        HeroController heroController = (HeroController) applicationContext.getBean("userController");

        List<Hero> users = heroController.findAll();

        System.out.println(users);
    }

}

