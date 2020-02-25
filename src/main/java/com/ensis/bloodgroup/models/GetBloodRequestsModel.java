package com.ensis.bloodgroup.models;

import java.util.Date;

public class GetBloodRequestsModel {
	
	private int requestid;
	private int userId;
	//private Integer donarid;
	private int requeststatusid;
	private String bloodgroup;
	private int bloodquantity;
	private String bloodrequireddate;
	private String comments;
	private String createddate;
	//private Date updateddate;
	//private int userid;
	private int acceptedDonorsCount;
	private int completedDonorsCount;
	
	
	
	private String userName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String mobileNumber;
	private String alternateMobileNumber;
	
	private String profileImageURL;
	private String emailId;
	private String currentLatitude;
	private String currentLongitude;
	
	
	private int donorreqid;
	
	private String requestCompletedDate;
	
	
	
	
	
	
	


	public String getRequestCompletedDate() {
		return requestCompletedDate;
	}
	public void setRequestCompletedDate(String requestCompletedDate) {
		this.requestCompletedDate = requestCompletedDate;
	}
	public int getAcceptedDonorsCount() {
		return acceptedDonorsCount;
	}
	public void setAcceptedDonorsCount(int acceptedDonorsCount) {
		this.acceptedDonorsCount = acceptedDonorsCount;
	}
	public int getCompletedDonorsCount() {
		return completedDonorsCount;
	}
	public void setCompletedDonorsCount(int completedDonorsCount) {
		this.completedDonorsCount = completedDonorsCount;
	}
	/**
	 * @return the bloodrequireddate
	 */
	public String getBloodrequireddate() {
		return bloodrequireddate;
	}
	/**
	 * @param bloodrequireddate the bloodrequireddate to set
	 */
	public void setBloodrequireddate(String bloodrequireddate) {
		this.bloodrequireddate = bloodrequireddate;
	}
	public int getDonorreqid() {
		return donorreqid;
	}
	public void setDonorreqid(int donorreqid) {
		this.donorreqid = donorreqid;
	}
	//private Date creteddate;
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
	/*	public Integer getDonarid() {
		return donarid;
	}
	public void setDonarid(Integer donarid) {
		this.donarid = donarid;
	}*/
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
	/*public Date getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}*/

	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the alternateMobileNumber
	 */
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	/**
	 * @param alternateMobileNumber the alternateMobileNumber to set
	 */
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	/**
	 * @return the profileImageUUID
	 */
	public String getProfileImageURL() {
		return profileImageURL;
	}
	/**
	 * @param profileImageUUID the profileImageUUID to set
	 */
	public void setProfileImageURL(String profileImageURL) {
		this.profileImageURL = profileImageURL;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the currentLatitude
	 */
	public String getCurrentLatitude() {
		return currentLatitude;
	}
	/**
	 * @param currentLatitude the currentLatitude to set
	 */
	public void setCurrentLatitude(String currentLatitude) {
		this.currentLatitude = currentLatitude;
	}
	/**
	 * @return the currentLongitude
	 */
	public String getCurrentLongitude() {
		return currentLongitude;
	}
	/**
	 * @param currentLongitude the currentLongitude to set
	 */
	public void setCurrentLongitude(String currentLongitude) {
		this.currentLongitude = currentLongitude;
	}
	
	/*public Date getCreteddate() {
		return creteddate;
	}
	public void setCreteddate(Date creteddate) {
		this.creteddate = creteddate;
	}*/
	
	
	
	
	
	
	
	
	
	

}
