package com.foodnet.springboot.model;

import java.util.Date;

public class PostModel {

    private String id;
    private String title;
    private String content;
    private Date regi_time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getRegi_time() {
        return regi_time;
    }

    public void setRegi_time(Date regi_time) {
        this.regi_time = regi_time;
    }
}
