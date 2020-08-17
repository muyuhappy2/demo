package com.rabbitmq.demo;

/**
 * @ClassName : StaticThread
 * @Description :
 * @Author : muyu
 * @Date: 2020-08-17 20:00
 */
public class StaticThread implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        StaticAction.print();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new StaticThread()).start();
        }
    }
}
