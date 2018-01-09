package com.wyj.dubbo.demo.provider;

import com.wyj.dubbo.demo.DemoService;

/**
 * 服务提供者实现服务定义
 * 
 * 
 * @author：WangYuanJun
 * @date：2018年1月9日 下午4:07:16
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}
