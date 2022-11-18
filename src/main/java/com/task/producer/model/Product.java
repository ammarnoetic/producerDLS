package com.task.producer.model;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;

    public Product(){

    }
    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return

        "{" +
                "\"name\":\""+name+"\"" +
                "}";
    }
}
