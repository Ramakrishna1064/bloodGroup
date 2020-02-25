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
@Table(name = "medicaltests")
public class MedicalTestDTO {

	@Id
	private int medicaltestid;
	private int userid;
	private String medicaltestname;
	private String description;
	private String result;
	private String comments;
	private Date testdate;

	/**
	 * @return the medicaltestid
	 */
	public int getMedicaltestid() {
		return medicaltestid;
	}

	/**
	 * @param medicaltestid
	 *            the medicaltestid to set
	 */
	public void setMedicaltestid(int medicaltestid) {
		this.medicaltestid = medicaltestid;
	}

	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}

	/**
	 * @param userid
	 *            the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}

	/**
	 * @return the medicaltestname
	 */
	public String getMedicaltestname() {
		return medicaltestname;
	}

	/**
	 * @param medicaltestname
	 *            the medicaltestname to set
	 */
	public void setMedicaltestname(String medicaltestname) {
		this.medicaltestname = medicaltestname;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the testdate
	 */
	public Date getTestdate() {
		return testdate;
	}

	/**
	 * @param testdate
	 *            the testdate to set
	 */
	public void setTestdate(Date testdate) {
		this.testdate = testdate;
	}

}
