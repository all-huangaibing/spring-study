package com.hab;

import com.hab.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




/**
 * 功能：
 *
 * @author huangaibing
 * @date 2020/7/7 14:41
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ac =  new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = ac.getBean("person");
        System.out.println("person = " + person);
        
    }
}
