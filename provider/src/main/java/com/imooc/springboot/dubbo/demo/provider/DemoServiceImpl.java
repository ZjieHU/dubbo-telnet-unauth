package com.imooc.springboot.dubbo.demo.provider;



import org.apache.dubbo.config.annotation.Service;

import com.imooc.springboot.dubbo.demo.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) throws Exception {
    	throw new Exception("抛出异常");
//        return "Hello, " + name + " (from Spring Boot)";
    }

}