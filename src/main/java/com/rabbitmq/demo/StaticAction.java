package com.rabbitmq.demo;

/**
 * @ClassName : StaticAction
 * @Description :
 * @Author : muyu
 * @Date: 2020-08-17 20:01
 */
public class StaticAction {
    public static void print() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ " step " + i + " is running.");
            sum += i;
        }
        System.out.println("sum is " + sum);
    }
}
