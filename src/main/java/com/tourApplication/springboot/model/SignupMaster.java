package com.tourApplication.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class SignupMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loginId;
	
	private String userName;
	private String password;
	
	@OneToOne(mappedBy = "user")
	private CustomerMaster customermaster;
	
	public long getLoginId() {
		return loginId;
	}
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SignupMaster [loginId=" + loginId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
