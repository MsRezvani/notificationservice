package com.digipay.notificationservice;

import com.digipay.paymentservice.paymentservice.notification.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

    private final ReceiveMessageHandler messageHandler;

    @PostMapping
    public void reciveMessage(@RequestBody Message message) {

        messageHandler.handleMessage(message);
    }
}
