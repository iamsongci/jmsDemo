package com.songci.jmsdemo.jms;

public class Consumer {
    public static void main(String[] args) {
        JMSConsumerThread jch=new JMSConsumerThread();
        jch.init();
        jch.consumer();
    }
}
