package com.rabbitmq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:    ProducerController
 * Package:    com.rabbitmq.controller
 * Description:
 * Datetime:    2020/6/2   17:55
 * Author:   木鱼
 */
@RestController
public class ProducerController {


    // @GetMapping("/queue_test")
    public String produce(String queueName, String message) {
        return "消息已经发送11";
    }

    /**
     * 功能描述:
     *
     * @auther: muyu
     * @param: [a, b]
     * @return: java.lang.String
     * @date: 2020/6/5 19:33
     */
    public String kk(String a, String b) {
        return "sss";
    }


}
