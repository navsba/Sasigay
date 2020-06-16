package org.ztk.entity;

public class User {
    private String userid;
    private String username;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String userid, String username) {
        this.userid = userid;
        this.username = username;
    }
}
