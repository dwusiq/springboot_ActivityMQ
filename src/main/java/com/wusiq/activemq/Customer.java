package com.wusiq.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 消息队列消费者
 * @author v_wbsqwu
 *
 */
@Component
public class Customer {
    private static final Logger LOGGER =  LoggerFactory.getLogger(Customer.class);
   

    @JmsListener(destination = "transQueue")
    public void receiveTranQueue(String tranInfoJson){
        LOGGER.debug("receiveTranQueue start.  tranInfoJson:{}",tranInfoJson);
        System.out.println("tranInfoJson:"+tranInfoJson);
        LOGGER.debug("receiveTranQueue end.");
    }

}
