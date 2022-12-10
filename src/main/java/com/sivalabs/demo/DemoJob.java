package com.sivalabs.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
@Slf4j
public class DemoJob {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Scheduled(fixedDelay = 15000)
    public void testJob() {
        log.info("Sending a message to kafka at "+ Instant.now());
        kafkaTemplate.send("demo-topic", "Sample message at "+ Instant.now());
        log.info("sent...");
    }
}
