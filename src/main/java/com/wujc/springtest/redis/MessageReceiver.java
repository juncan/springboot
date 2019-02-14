package com.wujc.springtest.redis;

import org.springframework.stereotype.Component;

/**
 * @author wujc
 * @ClassName MessageReceiver
 * @Description: TODO
 * @create 2018-10-04 17:15
 */

@Component
public class MessageReceiver {
    /**接收消息的方法*/
    public void receiveMessage(String message){
        System.out.println(message);
    }

}
