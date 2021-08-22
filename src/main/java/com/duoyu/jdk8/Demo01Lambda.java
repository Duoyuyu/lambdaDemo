package com.duoyu.jdk8;

/**
 * Hello world!
 *
 */
public class Demo01Lambda
{
    public static void main( String[] args )
    {
        // 创建一个新线程,传统写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程" + Thread.currentThread().getName());
            }
        }).start();

        System.out.println( "主线程" + Thread.currentThread().getName());

        // lambda 表达式是一个匿名函数，可以理解为一段可以传递的代码
        // 简化了匿名内部类的使用，语法更简单
        // 不关心方法访问权限、返回类型、方法名，只关心参数及方法体，中间用->分割
        // （参数类型 参数名称） -> { TODO }
        new Thread(() -> {
            System.out.println("lambda新线程" + Thread.currentThread().getName());
        }).start();
    }
}
