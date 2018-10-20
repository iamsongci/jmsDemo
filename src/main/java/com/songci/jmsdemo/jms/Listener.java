package com.songci.jmsdemo.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Listener implements MessageListener {
    public int num = 0;
    private ExecutorService threadPool =Executors.newFixedThreadPool(8);
    @Override
    public void onMessage(final Message message) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    num++;
                    System.out.println("收到的消息是(-"+num+"条-)："+((TextMessage)message).getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
