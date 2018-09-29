package com.wusiq.activemq;

import javax.jms.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description:消息队列，生产者 
 * @Author: v_wbsqwu
 */
@Component
public class Producer{
    private static final Logger LOGGER =  LoggerFactory.getLogger(Producer.class);

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    @Qualifier("trans_queue")
    private Queue transQueue;
    
    
    public void sendTranMsg(String msg){
        LOGGER.info("sendTranMsg：{}",msg);
        this.jmsMessagingTemplate.convertAndSend(this.transQueue,msg);
    }
}
