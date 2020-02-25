/**
 * 
 */
package com.ensis.bloodgroup.models;

/**
 * @author Ensis
 *
 */
public class DonarAcceptRequestModel {
	
	private int requestid;
	private int donarid;
	private int acceptstatus;
	
	
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
	 * @return the donarid
	 */
	public int getDonarid() {
		return donarid;
	}
	/**
	 * @param donarid the donarid to set
	 */
	public void setDonarid(int donarid) {
		this.donarid = donarid;
	}
	/**
	 * @return the acceptstatus
	 */
	public int getAcceptstatus() {
		return acceptstatus;
	}
	/**
	 * @param acceptstatus the acceptstatus to set
	 */
	public void setAcceptstatus(int acceptstatus) {
		this.acceptstatus = acceptstatus;
	}
	
	

}
