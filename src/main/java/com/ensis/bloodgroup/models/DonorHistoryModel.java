package com.ensis.bloodgroup.models;

import com.ensis.bloodgroup.dto.DonateRequestDTO;
import com.ensis.bloodgroup.dto.Recipient;

public class DonorHistoryModel {
	
	private int donorreqid;
	private Recipient recipient;
	private DonateRequestDTO request;
	
	private String requestCompletedDate;
	
	
	
	
	public String getRequestCompletedDate() {
		return requestCompletedDate;
	}
	public void setRequestCompletedDate(String requestCompletedDate) {
		this.requestCompletedDate = requestCompletedDate;
	}
	/**
	 * @return the donorreqid
	 */
	public int getDonorreqid() {
		return donorreqid;
	}
	/**
	 * @param donorreqid the donorreqid to set
	 */
	public void setDonorreqid(int donorreqid) {
		this.donorreqid = donorreqid;
	}

	/**
	 * @return the recipient
	 */
	public Recipient getRecipient() {
		return recipient;
	}
	/**
	 * @param recipient the recipient to set
	 */
	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}
	/**
	 * @return the request
	 */
	public DonateRequestDTO getRequest() {
		return request;
	}
	/**
	 * @param request the request to set
	 */
	public void setRequest(DonateRequestDTO request) {
		this.request = request;
	}
	

}
