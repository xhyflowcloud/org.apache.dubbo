package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;

/**
 * 接口服务实现
 */
public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "hello " + name;
    }
}
