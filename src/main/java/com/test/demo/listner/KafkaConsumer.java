package com.test.demo.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {

    @KafkaListener(topics = "myFirstTopic",groupId="group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    /*@KafkaListener(topics = "Kafka_Example_json", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }*/
}