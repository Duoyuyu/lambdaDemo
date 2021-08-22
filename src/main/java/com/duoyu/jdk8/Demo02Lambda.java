package com.duoyu.jdk8;

import com.duoyu.jdk8.service.HelloService;

/**
 * @Description
 * @Author wangduoyu
 * @Date 2021/8/20
 */
public class Demo02Lambda {
    public static void sayHello(HelloService helloService){
        helloService.say();
    }

    public static void main(String[] args) {
        // 匿名内部类
        sayHello(new HelloService() {
            @Override
            public void say() {
                System.out.println("匿名内部类");
            }
        });
        System.out.println("--------------------");
        // lambda 表达式
        sayHello(() -> {
            System.out.println("lambda 表达式匿名函数");
        });
        // lambda 表达式省略写法
        sayHello(() -> System.out.println("lambda 省略写法"));
    }
}
