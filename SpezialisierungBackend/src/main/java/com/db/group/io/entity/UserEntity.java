package com.db.group.io.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

public class UserEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -5936637517561138993L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //@Column(nullable = false)
    private String publicUserId;
    private String userName;


    //@Column(nullable = false)
    private String email;
    //@Column(nullable = false)
    private String password;

    public String getPublicUserId() {
        return publicUserId;
    }

    public void setPublicUserId(String publicUserId) {
        this.publicUserId = publicUserId;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
