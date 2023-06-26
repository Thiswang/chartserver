package org.example.controller;

import org.example.entity.Greeting;
import org.example.entity.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/**
 * @author zhe.wang@weimob.com
 * @date 2023/6/21 17:53
 */


@Controller
public class GreetingController {


    /**
     * 通过@MessageMapping注解来映射/hello这个地址，类似于@RequestMapping
     * @param message
     * @return
     * @throws Exception
     */
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
