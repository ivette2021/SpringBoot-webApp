package com.ihiviko.springboot.webapp.springbootweb.models.dto;

import com.ihiviko.springboot.webapp.springbootweb.models.User;

public class UserDto { 

    private String title ;
    private User user;//objeto como una relacion
    // private String lastname;
    // private String title ;
    // private String user; //olvides borrar y llamr los getter and setter

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
