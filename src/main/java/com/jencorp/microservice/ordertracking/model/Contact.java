package com.jencorp.microservice.ordertracking.model;

import java.io.Serializable;

public class Contact implements Serializable {
	
	private static final long serialVersionUID = -3318547857751606948L;
	String name;
	String email;
	String title;
    String AccountId;
    String AssistantName;
    String Birthdate;
    String HomePhone;
    String MobilePhone;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	public String getAssistantName() {
		return AssistantName;
	}
	public void setAssistantName(String assistantName) {
		AssistantName = assistantName;
	}
	public String getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}
	public String getHomePhone() {
		return HomePhone;
	}
	public void setHomePhone(String homePhone) {
		HomePhone = homePhone;
	}
	public String getMobilePhone() {
		return MobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		MobilePhone = mobilePhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
  

}
