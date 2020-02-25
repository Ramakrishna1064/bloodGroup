/**
 * 
 */
package com.ensis.bloodgroup.models;

import java.util.ArrayList;

/**
 * @author Ensis
 *
 */
public class GetDonerProfileModel {

	private String firstname;
	private String lastname;
	private String age;
	private String gender;
	private String mobile;
	private String alternatemobilenumber;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String address1;
	private String address2;
	private String latitude;
	private String longitude;
	private String imageUrl;
	private String lastdonateddate;
	private String emailId;
	
	private String governmentID;
	
	private boolean profileCompleted;
	private String bloodgroup;

	private ArrayList<DonerMedicalTests> medicacltests = new ArrayList<DonerMedicalTests>();
	
	
	
	

	public String getGovernmentID() {
		return governmentID;
	}


	public void setGovernmentID(String governmentID) {
		this.governmentID = governmentID;
	}


	public ArrayList<DonerMedicalTests> getMedicacltests() {
		return medicacltests;
	}


	public void setMedicacltests(ArrayList<DonerMedicalTests> medicacltests) {
		this.medicacltests = medicacltests;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLastdonateddate() {
		return lastdonateddate;
	}

	public void setLastdonateddate(String lastdonateddate) {
		this.lastdonateddate = lastdonateddate;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAlternatemobilenumber() {
		return alternatemobilenumber;
	}


	public void setAlternatemobilenumber(String alternatemobilenumber) {
		this.alternatemobilenumber = alternatemobilenumber;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	/**
	 * @return the ppppprofileCompleted
	 */
	public boolean isProfileCompleted() {
		return profileCompleted;
	}


	/**
	 * @param ppppprofileCompleted the ppppprofileCompleted to set
	 */
	public void setProfileCompleted(boolean profileCompleted) {
		this.profileCompleted = profileCompleted;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}

}
