package com.hfut.test;

import com.hfut.pojo.Airport;
import com.hfut.service.AirportService;
import com.hfut.service.impl.AirportServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        AirportServiceImpl bean=ac.getBean("airportService", AirportServiceImpl.class);
        List<Airport>list=bean.show();
        for(Airport tem:list){
            System.out.println(tem);
        }
        String[]names=ac.getBeanDefinitionNames();
        for(String tem:names){
            System.out.println(tem);
        }
    }
}
