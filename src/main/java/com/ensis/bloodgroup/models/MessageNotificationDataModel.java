package com.ensis.bloodgroup.models;

public class MessageNotificationDataModel {
	
	private String body;
	private String message;
	private int messageSenderId;
	private int donorreqid;
	private String messageSentDate;
	private int notificationType;
	
	
	
	public int getNotificationType() {
		return notificationType;
	}
	public void setNotificationType(int notificationType) {
		this.notificationType = notificationType;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageSenderId() {
		return messageSenderId;
	}
	public void setMessageSenderId(int messageSenderId) {
		this.messageSenderId = messageSenderId;
	}
	public int getDonorreqid() {
		return donorreqid;
	}
	public void setDonorreqid(int donorreqid) {
		this.donorreqid = donorreqid;
	}
	public String getMessageSentDate() {
		return messageSentDate;
	}
	public void setMessageSentDate(String messageSentDate) {
		this.messageSentDate = messageSentDate;
	}
	
	
	
	
	
	

}
