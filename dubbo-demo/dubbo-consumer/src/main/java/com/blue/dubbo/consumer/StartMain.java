package com.blue.dubbo.consumer;

import com.blue.dubbo.api.service.RandomService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: 沈杰
 * @e-mail: 1075850619@qq.com
 * @description:
 * @date: 2017/11/6
 */
public class StartMain {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        RandomService randomService =  context.getBean("randomService",RandomService.class);
        System.out.println("服务调用成功");
        for(int i=0;i<10;i++){
            System.out.println( randomService.getRandomInt()&0xffff );
        }
    }
}
