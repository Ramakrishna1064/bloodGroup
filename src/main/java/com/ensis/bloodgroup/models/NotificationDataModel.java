package com.ensis.bloodgroup.models;

public class NotificationDataModel {
	
	private String bloodGroup;
	private int donorreqid;
	private int requestId;
	private String body;
	private int notificationType;
	
	
	
	
	
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getNotificationType() {
		return notificationType;
	}
	public void setNotificationType(int notificationType) {
		this.notificationType = notificationType;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getDonorreqid() {
		return donorreqid;
	}
	public void setDonorreqid(int donorreqid) {
		this.donorreqid = donorreqid;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
}
