package com.practice.kafkazookeeper.model;

import java.io.Serializable;

/**
 * @Class : Message
 * @Description : 메시지를 주고받을 때 사용하는 클래스
 */
public class Message implements Serializable {
    private String author;
    private String content;
    private String timestamp;

    // 기본 생성자
    public Message() {
    }

    // getter, setter 생성
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
