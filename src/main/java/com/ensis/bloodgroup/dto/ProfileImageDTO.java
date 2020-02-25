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
@Table(name = "profileimage")
public class ProfileImageDTO {

	
	@Id
	private int imageid;
	private String imagename;
	private String createdby;
	private Date createddate;
	/**
	 * @return the imageid
	 */
	public int getImageid() {
		return imageid;
	}
	/**
	 * @param imageid the imageid to set
	 */
	public void setImageid(int imageid) {
		this.imageid = imageid;
	}
	/**
	 * @return the imagename
	 */
	public String getImagename() {
		return imagename;
	}
	/**
	 * @param imagename the imagename to set
	 */
	public void setImagename(String imagename) {
		this.imagename = imagename;
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
	
	
	
	
	
}
