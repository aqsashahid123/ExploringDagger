package com.example.aqsa.exploringdagger;

/**
 * Created by Dell on 2/12/2018.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("user")
    @Expose

    private User user;

    public Ding_ getDing() {
        return ding;
    }

    public void setDing(Ding_ ding) {
        this.ding = ding;
    }

    @SerializedName("ding")
    @Expose
    private Ding_ ding;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
