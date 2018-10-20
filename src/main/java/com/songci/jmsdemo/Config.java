package com.songci.jmsdemo;

import com.songci.jmsdemo.jms.JMSConsumerThread;
import com.songci.jmsdemo.jms.JMSProducerThread;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("jph")
    public JMSProducerThread getJMSProducerThread(){
        JMSProducerThread jph = new JMSProducerThread();
        jph.init();
        return jph;
    }

    @Bean("jch")
    public JMSConsumerThread JMSConsumerThread(){
        JMSConsumerThread jch=new JMSConsumerThread();
        jch.init();
        jch.consumer();
        return jch;
    }
}
