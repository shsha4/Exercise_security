package com.exercise.model;

import java.io.Serializable;

public class UserVO implements Serializable {
    private String user_id;
    private String user_name;
    private String user_pw;
    private String auth;
    private int enabled;

    public UserVO() {
    }

    public UserVO(String user_id, String user_name, String user_pw, String auth, int enabled) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_pw = user_pw;
        this.auth = auth;
        this.enabled = enabled;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_pw='" + user_pw + '\'' +
                ", auth='" + auth + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
