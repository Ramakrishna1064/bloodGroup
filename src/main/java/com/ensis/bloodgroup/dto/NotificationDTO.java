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
@Table(name = "usernotification")
public class NotificationDTO {
	
	@Id
	private int notificationid;
	private int userid;
	private int devicetype;
	private String deviceid;
	private String gcmid;
	private boolean notificationenable;
	private String createdby;
	private Date createddate;
	private String updatedby;
	private Date updateddate;
	/**
	 * @return the notificationid
	 */
	public int getNotificationid() {
		return notificationid;
	}
	/**
	 * @param notificationid the notificationid to set
	 */
	public void setNotificationid(int notificationid) {
		this.notificationid = notificationid;
	}
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @return the devicetype
	 */
	public int getDevicetype() {
		return devicetype;
	}
	/**
	 * @param devicetype the devicetype to set
	 */
	public void setDevicetype(int devicetype) {
		this.devicetype = devicetype;
	}

	/**
	 * @return the deviceid
	 */
	public String getDeviceid() {
		return deviceid;
	}
	/**
	 * @param deviceid the deviceid to set
	 */
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	/**
	 * @return the gcmid
	 */
	public String getGcmid() {
		return gcmid;
	}
	/**
	 * @param gcmid the gcmid to set
	 */
	public void setGcmid(String gcmid) {
		this.gcmid = gcmid;
	}
	/**
	 * @return the notificationenable
	 */
	public boolean isNotificationenable() {
		return notificationenable;
	}
	/**
	 * @param notificationenable the notificationenable to set
	 */
	public void setNotificationenable(boolean notificationenable) {
		this.notificationenable = notificationenable;
	}
	/**
	 * @return the createdby
	 */
	public String getCreatedby() {
		return createdby;
	}
	/**
	 * @param createdby the createdby to set
	 */
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
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
	 * @return the updatedby
	 */
	public String getUpdatedby() {
		return updatedby;
	}
	/**
	 * @param updatedby the updatedby to set
	 */
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
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
