package com.ensis.bloodgroup.models;


public class RequiredDonorToSendRequestModel {
	private int userId;
	private String bloodGroup;
	private int bloodQuantity;
	private String latitude;
	private String longitude;
	private String dateBloodRequired;
	
	
	
	
	
	/**
	 * @return the dateBloodRequired
	 */
	public String getDateBloodRequired() {
		return dateBloodRequired;
	}
	/**
	 * @param dateBloodRequired the dateBloodRequired to set
	 */
	public void setDateBloodRequired(String dateBloodRequired) {
		this.dateBloodRequired = dateBloodRequired;
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
	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}
	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	/**
	 * @return the bloodQuantity
	 */
	public int getBloodQuantity() {
		return bloodQuantity;
	}
	/**
	 * @param bloodQuantity the bloodQuantity to set
	 */
	public void setBloodQuantity(int bloodQuantity) {
		this.bloodQuantity = bloodQuantity;
	}
	
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


}
