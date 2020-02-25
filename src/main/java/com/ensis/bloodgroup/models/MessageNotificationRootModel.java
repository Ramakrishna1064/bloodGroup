package com.ensis.bloodgroup.models;

import java.util.ArrayList;

public class MessageNotificationRootModel {
	
	private ArrayList<String> registration_ids;
	private String priority;
	//private NotificationBodyModel notification;
	private MessageNotificationDataModel data;
	public ArrayList<String> getRegistration_ids() {
		return registration_ids;
	}
	public void setRegistration_ids(ArrayList<String> registration_ids) {
		this.registration_ids = registration_ids;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public MessageNotificationDataModel getData() {
		return data;
	}
	public void setData(MessageNotificationDataModel data) {
		this.data = data;
	}
	
	
	

}
