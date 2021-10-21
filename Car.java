package com.wizard;

public class Car<String> {
private String type;



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public java.lang.String toString() {
        return "Car{" +
                "type=" + type +
                '}';
    }
}


