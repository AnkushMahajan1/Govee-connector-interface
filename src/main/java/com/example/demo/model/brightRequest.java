package com.example.demo.model;

public class brightRequest {

    "cmd\":{\"value\":25,\"name\":\"brightness\"},

    private String cmdName;

    private int value;

    public brightRequest() {
    }

    public String getCmdName() {
        return cmdName;
    }

    public void setCmdName(String cmdName) {
        this.cmdName = cmdName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
