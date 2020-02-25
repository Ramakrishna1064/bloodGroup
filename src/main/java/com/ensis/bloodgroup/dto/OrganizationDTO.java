package com.ensis.bloodgroup.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "organization")
public class OrganizationDTO {
	
	@Id
	private int organizationid;
	private int userid;
	private String organizationname;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String phonenumber;
	private String mobilenumber;
	private String orgdescription;
	private Date creteddate;
	/**
	 * @return the organizationid
	 */
	public int getOrganizationid() {
		return organizationid;
	}
	/**
	 * @param organizationid the organizationid to set
	 */
	public void setOrganizationid(int organizationid) {
		this.organizationid = organizationid;
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
	 * @return the organizationname
	 */
	public String getOrganizationname() {
		return organizationname;
	}
	/**
	 * @param organizationname the organizationname to set
	 */
	public void setOrganizationname(String organizationname) {
		this.organizationname = organizationname;
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}
	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * @return the mobilenumber
	 */
	public String getMobilenumber() {
		return mobilenumber;
	}
	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	/**
	 * @return the orgdescription
	 */
	public String getOrgdescription() {
		return orgdescription;
	}
	/**
	 * @param orgdescription the orgdescription to set
	 */
	public void setOrgdescription(String orgdescription) {
		this.orgdescription = orgdescription;
	}
	/**
	 * @return the creteddate
	 */
	public Date getCreteddate() {
		return creteddate;
	}
	/**
	 * @param creteddate the creteddate to set
	 */
	public void setCreteddate(Date creteddate) {
		this.creteddate = creteddate;
	}
	
	


}
