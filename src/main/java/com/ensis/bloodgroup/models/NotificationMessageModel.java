/**
 * 
 */
package com.ensis.bloodgroup.models;

/**
 * @author Ensis
 *
 */
public class NotificationMessageModel {
	
	private String message;
	private int requestid;
	private String bloodgroup;
	
	
	

	/**
	 * @return the requestid
	 */
	public int getRequestid() {
		return requestid;
	}

	/**
	 * @param requestid the requestid to set
	 */
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}

	/**
	 * @return the bloodgroup
	 */
	public String getBloodgroup() {
		return bloodgroup;
	}

	/**
	 * @param bloodgroup the bloodgroup to set
	 */
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
