package com.wyj.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyj.dubbo.demo.DemoService;

/**
 * 启动服务消费者
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月9日 下午10:00:33
 */
public class Consumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        classPathXmlApplicationContext.start();
        DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("demoService"); 

        while (true) {
            try {
                Thread.sleep(1000);
                String hello = demoService.sayHello("world"); 
                System.out.println(hello); 

            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }

        }
    }

}
