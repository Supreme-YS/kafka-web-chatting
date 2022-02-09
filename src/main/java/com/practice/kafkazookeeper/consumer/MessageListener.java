package com.practice.kafkazookeeper.consumer;

import com.practice.kafkazookeeper.constant.KafkaConstants;
import com.practice.kafkazookeeper.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageListener {

    private final SimpMessagingTemplate template;

    /**
     * @Name : @KafkaListener
     * @Description : 카프카로부터 메시지를 받을 수 있음
     * @param message
     */
    @KafkaListener(
            topics = KafkaConstants.KAFKA_TOPIC,
            groupId = KafkaConstants.GROUP_ID
    )

    /**
     * @Name : convertAndSend
     * @Description : 웹 소켓으로 메세지를 전송
     */
    public void listen(Message message) {
        log.info("sending via kafka listener..");

        template.convertAndSend("/topic/group", message);
    }
}
