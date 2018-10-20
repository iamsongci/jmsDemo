package com.songci.jmsdemo;

import com.songci.jmsdemo.jms.JMSProducerThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ctr {
    public static int num =  0;
    @Autowired
    JMSProducerThread jmsProducerThread;
    @RequestMapping("commit")
    public int commit(@RequestParam("msg")String msg){
        jmsProducerThread.oneThreadpProduce(msg);
        num++;
        return num;
    }
}
