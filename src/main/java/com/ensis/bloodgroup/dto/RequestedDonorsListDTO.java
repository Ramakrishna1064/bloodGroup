package com.ensis.bloodgroup.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "requesteddonors")
public class RequestedDonorsListDTO {
	
	@Id
	private int donorreqid;
	
	private int donorid;
	private int userId;
	private int requestid;
	private int requeststatus;
	private Date requestCompletedDate;
	
	
	
	public Date getRequestCompletedDate() {
		return requestCompletedDate;
	}
	public void setRequestCompletedDate(Date requestCompletedDate) {
		this.requestCompletedDate = requestCompletedDate;
	}
	public int getDonorreqid() {
		return donorreqid;
	}
	public void setDonorreqid(int donorreqid) {
		this.donorreqid = donorreqid;
	}
	public int getDonorid() {
		return donorid;
	}
	public void setDonorid(int donorid) {
		this.donorid = donorid;
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
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public int getRequeststatus() {
		return requeststatus;
	}
	public void setRequeststatus(int requeststatus) {
		this.requeststatus = requeststatus;
	}
	
	
}
