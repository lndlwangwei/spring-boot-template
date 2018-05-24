/*
 *  Copyright (C) 2017 the xkw.com authors.
 *  http://www.xkw.com
 */

package cn.iwangwei.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    //系统用户
    public final static String SYSTEM = "system";

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String fullname;
    private String mobile;
    /**
     * 拆解岗质量等级，默认为5级
     */
    private int p2Priority = 5;
    /**
     * 解析岗质量等级，默认是5级
     */
    private int p3Priority = 5;

    public User() {
    }

    public User(long id, String username, String fullname, String mobile) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.mobile = mobile;
    }

    public User(String username, int p2Priority, int p3Priority) {
        this.username = username;
        this.p2Priority = p2Priority;
        this.p3Priority = p3Priority;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getP2Priority() {
        return p2Priority;
    }

    public void setP2Priority(int p2Priority) {
        this.p2Priority = p2Priority;
    }

    public int getP3Priority() {
        return p3Priority;
    }

    public void setP3Priority(int p3Priority) {
        this.p3Priority = p3Priority;
    }
}
