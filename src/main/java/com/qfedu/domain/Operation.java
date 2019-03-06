package com.qfedu.domain;

import java.util.Date;

public class Operation {
    private Integer id;
    private String name;
    private Date time;
    private Integer type;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", type=" + type +
                ", username='" + username + '\'' +
                '}';
    }
}
