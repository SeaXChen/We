package com.lzx.hdu.pojo;

import java.util.Date;

public class User {
    private Integer uid;

    private String userName;

    private String password;

    private Date birthday;

    private String constellation;

    private Date lastLoginTime;

    private Date zoneCreatedTime;

    private String loveDeclaration;

    private Integer halfId;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getZoneCreatedTime() {
        return zoneCreatedTime;
    }

    public void setZoneCreatedTime(Date zoneCreatedTime) {
        this.zoneCreatedTime = zoneCreatedTime;
    }

    public String getLoveDeclaration() {
        return loveDeclaration;
    }

    public void setLoveDeclaration(String loveDeclaration) {
        this.loveDeclaration = loveDeclaration;
    }

    public Integer getHalfId() {
        return halfId;
    }

    public void setHalfId(Integer halfId) {
        this.halfId = halfId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

}