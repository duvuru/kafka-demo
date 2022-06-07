package com.ragainfotech.listener;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaListeners {

    @KafkaListener(
            topics = "kafkademotopic",
            groupId="kafkademogroupId"
    )
    void listener(String data){
        System.out.println("Listener received: "+data+" :-)");
    }
}
