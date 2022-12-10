package com.sivalabs.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventHandler {

    @KafkaListener(topics = "demo-topic")
    public void handle(String payload) {
        log.info("Received a message with payload:{}: ", payload);
    }
}
