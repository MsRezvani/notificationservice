package com.digipay.notificationservice;

import com.digipay.paymentservice.paymentservice.notification.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReceiveMessageHandler {

    private static final String BASE_URL = "https://sms-provider/messages/send-sms";
    private final RestTemplate restTemplate;

    public void handleMessage(Message message) {

        System.out.println("Send Sms Message : " + message);
//        restTemplate.postForObject(BASE_URL, message, Void.class);
    }
}
