package com.example.usermanager.service;

import com.example.usermanager.model.DataSample;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class KafkaConsumerServiceImpl {
    // receive data kafka
    @KafkaListener(topics = "person", groupId = "groupId")
    public void consume(String person) {
        log.info(String.format("#### -> Consumed message -> %s", person));
    }
}
