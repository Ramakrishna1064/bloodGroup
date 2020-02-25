package com.ensis.bloodgroup.models;

import java.util.Date;

public class MessageModel {

	private int messageId;
	private int messageSenderId;
	private int messageRecieverId;
	private String message;
	private int messageStatus;
	private String messageSentDate;
	private int donorreqid;
	
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getMessageSenderId() {
		return messageSenderId;
	}
	public void setMessageSenderId(int messageSenderId) {
		this.messageSenderId = messageSenderId;
	}
	public int getMessageRecieverId() {
		return messageRecieverId;
	}
	public void setMessageRecieverId(int messageRecieverId) {
		this.messageRecieverId = messageRecieverId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageStatus() {
		return messageStatus;
	}
	public void setMessageStatus(int messageStatus) {
		this.messageStatus = messageStatus;
	}
	public String getMessageSentDate() {
		return messageSentDate;
	}
	public void setMessageSentDate(String messageSentDate) {
		this.messageSentDate = messageSentDate;
	}
	public int getDonorreqid() {
		return donorreqid;
	}
	public void setDonorreqid(int donorreqid) {
		this.donorreqid = donorreqid;
	}
	
	
}
