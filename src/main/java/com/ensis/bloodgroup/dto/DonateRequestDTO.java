/**
 * 
 */
package com.ensis.bloodgroup.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ensis
 *
 */
@Entity
@Table(name = "bloodrequests")
public class DonateRequestDTO {
	
	@Id
	private int requestid;
	private int userId;
	
	private int requeststatusid;
	private String bloodgroup;
	private int bloodquantity;
	private Date datebloodrequired;
	private String comments;
	private Date createddate;
	private Date updateddate;
	
	
	
	/**
	 * @return the datebloodrequired
	 */
	public Date getDatebloodrequired() {
		return datebloodrequired;
	}
	/**
	 * @param datebloodrequired the datebloodrequired to set
	 */
	public void setDatebloodrequired(Date datebloodrequired) {
		this.datebloodrequired = datebloodrequired;
	}
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
	 * @return the requeststatusid
	 */
	public int getRequeststatusid() {
		return requeststatusid;
	}
	/**
	 * @param requeststatusid the requeststatusid to set
	 */
	public void setRequeststatusid(int requeststatusid) {
		this.requeststatusid = requeststatusid;
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
	 * @return the bloodquantity
	 */
	public int getBloodquantity() {
		return bloodquantity;
	}
	/**
	 * @param bloodquantity the bloodquantity to set
	 */
	public void setBloodquantity(int bloodquantity) {
		this.bloodquantity = bloodquantity;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the createddate
	 */
	public Date getCreateddate() {
		return createddate;
	}
	/**
	 * @param createddate the createddate to set
	 */
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	/**
	 * @return the updateddate
	 */
	public Date getUpdateddate() {
		return updateddate;
	}
	/**
	 * @param updateddate the updateddate to set
	 */
	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}
	
	
	

}
