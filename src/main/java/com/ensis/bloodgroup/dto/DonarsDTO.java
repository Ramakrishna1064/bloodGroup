package com.ensis.bloodgroup.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donar")
public class DonarsDTO {

	@Id
	private int donarid;
	private int userid;
	private String firstname;
	private String lastname;
	private String gender;
	private String age;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String donarlatitude;
	private String donarlongitude;
	private String currentlatitude;
	private String currentlongitude;
	private String bloodgroup;
	private String mobilenumber;
	private String alternatemobilenumber;
	private Date createddate;
	private String profileImageUUID;
	private Date lastdonateddate;
	private String governmentid;
	
	
	
	
	/**
	 * @return the lastdonateddate
	 */
	public Date getLastdonateddate() {
		return lastdonateddate;
	}
	/**
	 * @param lastdonateddate the lastdonateddate to set
	 */
	public void setLastdonateddate(Date lastdonateddate) {
		this.lastdonateddate = lastdonateddate;
	}
	
	/**
	 * @return the governmentid
	 */
	public String getGovernmentid() {
		return governmentid;
	}
	/**
	 * @param governmentid the governmentid to set
	 */
	public void setGovernmentid(String governmentid) {
		this.governmentid = governmentid;
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
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
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
	 * @return the donarlatitude
	 */
	public String getDonarlatitude() {
		return donarlatitude;
	}
	/**
	 * @param donarlatitude the donarlatitude to set
	 */
	public void setDonarlatitude(String donarlatitude) {
		this.donarlatitude = donarlatitude;
	}
	/**
	 * @return the donarlongitude
	 */
	public String getDonarlongitude() {
		return donarlongitude;
	}
	/**
	 * @param donarlongitude the donarlongitude to set
	 */
	public void setDonarlongitude(String donarlongitude) {
		this.donarlongitude = donarlongitude;
	}
	/**
	 * @return the currentlatitude
	 */
	public String getCurrentlatitude() {
		return currentlatitude;
	}
	/**
	 * @param currentlatitude the currentlatitude to set
	 */
	public void setCurrentlatitude(String currentlatitude) {
		this.currentlatitude = currentlatitude;
	}
	/**
	 * @return the currentlongitude
	 */
	public String getCurrentlongitude() {
		return currentlongitude;
	}
	/**
	 * @param currentlongitude the currentlongitude to set
	 */
	public void setCurrentlongitude(String currentlongitude) {
		this.currentlongitude = currentlongitude;
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
	 * @return the alternatemobilenumber
	 */
	public String getAlternatemobilenumber() {
		return alternatemobilenumber;
	}
	/**
	 * @param alternatemobilenumber the alternatemobilenumber to set
	 */
	public void setAlternatemobilenumber(String alternatemobilenumber) {
		this.alternatemobilenumber = alternatemobilenumber;
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
	 * @return the imageid
	 */
	/**
	 * @return the profileImageUUID
	 */
	public String getProfileImageUUID() {
		return profileImageUUID;
	}
	/**
	 * @param profileImageUUID the profileImageUUID to set
	 */
	public void setProfileImageUUID(String profileImageUUID) {
		this.profileImageUUID = profileImageUUID;
	}

	
	
	

	
}
