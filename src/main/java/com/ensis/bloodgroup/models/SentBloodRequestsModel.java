package com.ensis.bloodgroup.models;


public class SentBloodRequestsModel {
	private int requestid;
	private int userId;
	private int acceptedDonorsCount;
	private int requeststatusid;
	private String bloodgroup;
	private int bloodquantity;
	private String datebloodrequired;
	private String comments;
	private String createddate;
	private int requiredPendingQuantity;
	
	
	
	
	/**
	 * @return the requiredPendingQuantity
	 */
	public int getRequiredPendingQuantity() {
		return requiredPendingQuantity;
	}
	/**
	 * @param requiredPendingQuantity the requiredPendingQuantity to set
	 */
	public void setRequiredPendingQuantity(int requiredPendingQuantity) {
		this.requiredPendingQuantity = requiredPendingQuantity;
	}
	/**
	 * @return the acceptedDonorsCount
	 */
	public int getAcceptedDonorsCount() {
		return acceptedDonorsCount;
	}
	/**
	 * @param acceptedDonorsCount the acceptedDonorsCount to set
	 */
	public void setAcceptedDonorsCount(int acceptedDonorsCount) {
		this.acceptedDonorsCount = acceptedDonorsCount;
	}
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRequeststatusid() {
		return requeststatusid;
	}
	public void setRequeststatusid(int requeststatusid) {
		this.requeststatusid = requeststatusid;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public int getBloodquantity() {
		return bloodquantity;
	}
	public void setBloodquantity(int bloodquantity) {
		this.bloodquantity = bloodquantity;
	}
	public String getDatebloodrequired() {
		return datebloodrequired;
	}
	public void setDatebloodrequired(String datebloodrequired) {
		this.datebloodrequired = datebloodrequired;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	

}
