package com.ensis.bloodgroup.models;

public class ListOfConversationItemModel {

	private int donorreqid;
	private String name;
	private int status;
	private String bloodGroup;
	private int donorId;
	private int recipientId;
	
	
	
	public int getDonorreqid() {
		return donorreqid;
	}
	public void setDonorreqid(int donorreqid) {
		this.donorreqid = donorreqid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getDonorId() {
		return donorId;
	}
	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}
	public int getRecipientId() {
		return recipientId;
	}
	public void setRecipientId(int recipientId) {
		this.recipientId = recipientId;
	}
	
	
	
	
	
	
	
}
