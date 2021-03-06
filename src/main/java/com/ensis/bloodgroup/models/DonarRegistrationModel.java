/**
 * 
 */
package com.ensis.bloodgroup.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Ensis
 *
 */
public class DonarRegistrationModel {

	
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String mobile;
	private String alternatemobile;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String bloodgroup;
	private String age;
	private String gender;
	private int userId;
	private String profileImageUUID;
	private String lastdonateddate;
	private String governmentid;
	
	private ArrayList<DonerMedicalTests> medicacltests=new ArrayList<DonerMedicalTests>();
	
	
	
	
	/**
	 * @return the lastdonateddate
	 */
	public String getLastdonateddate() {
		return lastdonateddate;
	}
	/**
	 * @param lastdonateddate the lastdonateddate to set
	 */
	public void setLastdonateddate(String lastdonateddate) {
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
	 * @return the medicacltests
	 */
	public ArrayList<DonerMedicalTests> getMedicacltests() {
		return medicacltests;
	}
	/**
	 * @param medicacltests the medicacltests to set
	 */
	public void setMedicacltests(ArrayList<DonerMedicalTests> medicacltests) {
		this.medicacltests = medicacltests;
	}
	/**
	 * @return the imageid
	 */

	/**
	 * @return the userid
	 */
	public int getUserId() {
		return userId;
	}
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
	/**
	 * @param userid the userid to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the alternatemobile
	 */
	public String getAlternatemobile() {
		return alternatemobile;
	}
	/**
	 * @param alternatemobile the alternatemobile to set
	 */
	public void setAlternatemobile(String alternatemobile) {
		this.alternatemobile = alternatemobile;
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
	
	
	
	
	
	
	
	
	
}
