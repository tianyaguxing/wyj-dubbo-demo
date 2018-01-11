package com.wyj.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务提供者
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月9日 下午9:10:38
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        System.out.println(classPathXmlApplicationContext.getDisplayName() + ": here");
        classPathXmlApplicationContext.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
