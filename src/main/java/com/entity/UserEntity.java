package com.entity;

public class UserEntity {
    private Integer id;

    private String wechat;

    private String stuStr;

    private String phone;

    private String labPos;

    private String personIdentity;

    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getStuStr() {
        return stuStr;
    }

    public void setStuStr(String stuStr) {
        this.stuStr = stuStr == null ? null : stuStr.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLabPos() {
        return labPos;
    }

    public void setLabPos(String labPos) {
        this.labPos = labPos == null ? null : labPos.trim();
    }

    public String getPersonIdentity() {
        return personIdentity;
    }

    public void setPersonIdentity(String personIdentity) {
        this.personIdentity = personIdentity == null ? null : personIdentity.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}