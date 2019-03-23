package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user")
public class UserKey implements Serializable {
    @Id
    @Column(name = "Host")
    private String host;

    @Id
    @Column(name = "User")
    private String user;

    private static final long serialVersionUID = 1L;

    /**
     * @return Host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * @return User
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}