package cn.org.springbook.book.entity;

import java.util.Date;

/**
 * 书籍作者信息表
 *
 * @author 戴志勇
 */
public class BookAuthorEntity {

    private Integer id;
    private Date registryTime;
    private String userId;
    private String userRegistryTime;
    private String penName;
    private String realName;
    private Date birthday;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRegistryTime() {
        return registryTime;
    }

    public void setRegistryTime(Date registryTime) {
        this.registryTime = registryTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRegistryTime() {
        return userRegistryTime;
    }

    public void setUserRegistryTime(String userRegistryTime) {
        this.userRegistryTime = userRegistryTime;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
