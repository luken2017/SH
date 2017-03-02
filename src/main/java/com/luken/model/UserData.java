package com.luken.model;


import java.util.Date;
import java.util.UUID;

public class UserData {

	private UUID id;
	private String userName;
	private String email;
	private String password;
	private Date createdDateTime;
	private Date modifiedDateTime;
	
	public UserData() {
		
	}
	
	public UserData(String userName, String email, String password, Date createdDateTime, Date modifiedDateTime) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.createdDateTime = createdDateTime;
		this.modifiedDateTime = modifiedDateTime;
	}
	
	@Override
	public String toString() {
		return "UserData [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", createdDateTime=" + createdDateTime + ", modifiedDateTime=" + modifiedDateTime + "]";
	}

	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
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
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public Date getModifiedDateTime() {
		return modifiedDateTime;
	}
	public void setModifiedDateTime(Date modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

}
