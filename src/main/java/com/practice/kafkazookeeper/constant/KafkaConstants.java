package com.practice.kafkazookeeper.constant;

/**
 * @Class : KafkaConstants
 */
public class KafkaConstants {
    // 생성할 토픽의 이름
    public static final String KAFKA_TOPIC = "kafka-chat";
    // Consumer를 식별할 수 있는 그룹
    public static final String GROUP_ID = "foo";
    // Kafka 클러스터에 연결하기 위한 <호스트:포트값>
    public static final String KAFKA_BROKER = "localhost:9092";

}
