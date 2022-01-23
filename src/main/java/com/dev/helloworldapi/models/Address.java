package com.dev.helloworldapi.models;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int apt;
    private String state;

    public int getApt() {
        return apt;
    }

    public void setApt(int apt) {
        this.apt = apt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
