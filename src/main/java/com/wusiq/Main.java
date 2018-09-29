package com.wusiq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Main {

    //交易数据消息队列
    @Bean("trans_queue")
    public Queue transQueue(){
        return new ActiveMQQueue("transQueue");
    }
	
	public static void main(String args[]) {
		SpringApplication.run(Main.class, args);
	}
}
