package cn.org.springbook.book.entity;

import java.util.Date;

/**
 * @author 戴志勇
 */
public class BookEntity {

    private Integer id;           // 书籍主键
    private String publishTime;  // 发布时间：不能为空
    private String name;         // 书名，不能为空
    private String profile;      // 书籍简介
    private String authorId;    // 作者id
    private Date authorRegistryTime; // 作者注册时间
    private String writeStatus; // 写作状态：0：连载中, 1：完结
    private Integer paymentTypeId; // 付费类型：0：全本免费，1：限时免费，2：按章付费，3：试读付费，

    private BookEntity paymentTypeIdEntity;
    private BookAuthorEntity authorIdEntity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public Date getAuthorRegistryTime() {
        return authorRegistryTime;
    }

    public void setAuthorRegistryTime(Date authorRegistryTime) {
        this.authorRegistryTime = authorRegistryTime;
    }

    public String getWriteStatus() {
        return writeStatus;
    }

    public void setWriteStatus(String writeStatus) {
        this.writeStatus = writeStatus;
    }

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public BookEntity getPaymentTypeIdEntity() {
        return paymentTypeIdEntity;
    }

    public void setPaymentTypeIdEntity(BookEntity paymentTypeIdEntity) {
        this.paymentTypeIdEntity = paymentTypeIdEntity;
    }

    public BookAuthorEntity getAuthorIdEntity() {
        return authorIdEntity;
    }

    public void setAuthorIdEntity(BookAuthorEntity authorIdEntity) {
        this.authorIdEntity = authorIdEntity;
    }
}
