package com.songci.jmsdemo.jms;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Producer {
    public static void main(String[] args) {
        JMSProducerThread jph = new JMSProducerThread();
        jph.init();
        for(int i=0;i<10000;i++){
            jph.oneThreadpProduce("第"+(i+1)+"条消息");
        }
//        ExecutorService threadPool = Executors.newFixedThreadPool(3);
//        for (int i = 0; i < 5; i++) {
//            threadPool.submit(new Runnable() {
//
//                @Override
//                public void run() {
//                    JMSProducerThread jph = new JMSProducerThread();
////                    try {
////                        Thread.sleep(new Random().nextInt(5) * 500);
////                    } catch (Exception e) {
////                        e.printStackTrace();
////                    }
//                    jph.init();
//                    jph.produce();
//                }
//            });
//
//        }
    }
}
