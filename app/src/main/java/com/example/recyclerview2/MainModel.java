package com.example.recyclerview2;

public class MainModel {
    private int avatar,messageState;
    private String title,message,sentAt;

    // getters
    public int getAvatar() {
        return avatar;
    }

    public int getMessageState() {
        return messageState;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public String getSentAt() {
        return sentAt;
    }

    // setters
    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setMessageState(int messageState) {
        this.messageState = messageState;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }
}
