package org.example.entity;

/**
 * @author zhe.wang@weimob.com
 * @date 2023/6/21 17:53
 */
public class HelloMessage {

    private String name;

    public HelloMessage() {
    }

    public HelloMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
