package com.itheima.test;

import com.itheima.dao.ItemsMapper;
import com.itheima.domain.Items;
import com.itheima.service.Itemservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
  public void itemsTest(){
        ApplicationContext app =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ItemsMapper mapper = app.getBean(ItemsMapper.class);
        Items byId = mapper.findById(1);
        System.out.println(byId);
    }
    @Test
    public void itemsTest2(){
        ApplicationContext app =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Itemservice mapper = app.getBean(Itemservice.class);
        Items byId = mapper.findById(1);
        System.out.println(byId.getName());
    }
}
