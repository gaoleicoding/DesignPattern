package com.java.designpattern.pattern23_bridge;

public abstract class AbstractMessage {
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}