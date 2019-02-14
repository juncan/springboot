package com.wujc.springtest.entity;

import java.io.Serializable;

/**
 * @author wujc
 * @ClassName User
 * @Description: TODO
 * @create 2018-12-15 11:35
 */
public class User implements Serializable {

    private static final long serialVersionUID = 9084013441412499878L;
    private Long id;
    private String userName;
    private String passWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

