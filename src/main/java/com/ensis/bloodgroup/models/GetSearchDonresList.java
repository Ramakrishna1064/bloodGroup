/**
 * 
 */
package com.ensis.bloodgroup.models;

import java.util.ArrayList;

/**
 * @author Ensis
 *
 */
public class GetSearchDonresList {

	private int donarid;
	private String firstname;
	private String lastname;
	private String gender;
	private String age;
	private String email;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String latitude;
	private String longitude;
	private String bloodgroup;
	private String mobilenumber;
	private String alternatemobilenumber;
	private String createddate;
	private String profileImageURL;
	
	private ArrayList<DonerMedicalTests> medicacltests=new ArrayList<DonerMedicalTests>();

	
	
	
	
	
	
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
	 * @return the imageUrl
	 */

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the profileImageURL
	 */
	public String getProfileImageURL() {
		return profileImageURL;
	}
	/**
	 * @param profileImageURL the profileImageURL to set
	 */
	public void setProfileImageURL(String profileImageURL) {
		this.profileImageURL = profileImageURL;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
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
	public String getCreateddate() {
		return createddate;
	}
	/**
	 * @param createddate the createddate to set
	 */
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	
	
	
	

}
