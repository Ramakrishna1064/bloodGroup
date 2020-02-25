package com.ensis.bloodgroup.service.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ensis.bloodgroup.dto.MessagesDTO;
import com.ensis.bloodgroup.dto.NotificationDTO;
import com.ensis.bloodgroup.models.DonorLocationDetailsModel;
import com.ensis.bloodgroup.models.DonorLocationDetailsRootModel;
import com.ensis.bloodgroup.models.MessageNotificationDataModel;
import com.ensis.bloodgroup.models.MessageNotificationRootModel;
import com.ensis.bloodgroup.models.NotificationDataModel;
import com.ensis.bloodgroup.models.NotificationMessageModel;
import com.ensis.bloodgroup.models.NotificationRootModel;
import com.ensis.bloodgroup.models.NotifyUserRequestStatusModel;
import com.ensis.bloodgroup.models.TrackDonarLocation;
import com.ensis.bloodgroup.utis.Constants;
import com.ensis.bloodgroup.utis.MessageResources;
import com.ensis.bloodgroup.utis.Utilities;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Service
public class NotifcationService extends MessageResources {

	/**
	 * 
	 * @param name
	 * @param devicesList
	 * @param treatmentQuestionId
	 */
	public void sendNewQuestionNotification(int requestId,String name,
			ArrayList<NotificationDTO> devicesList,String bloodgroup,int donorreqid,int notificationType) {

		try {
			
			NotificationMessageModel notificationQuestionModel = new NotificationMessageModel();
			notificationQuestionModel.setMessage(name);
			notificationQuestionModel.setBloodgroup(bloodgroup);
			notificationQuestionModel.setRequestid(donorreqid);
			sendCommonNotification(requestId,notificationQuestionModel, devicesList,notificationType);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * 
	 * @param devicesList
	 * @param bloodgroup
	 * @param donorreqid
	 * @param notificationType
	 */
	public void sendNotificatonToUser(int requestId,ArrayList<NotificationDTO> devicesList,String bloodgroup,int donorreqid,int notificationType)
	{
		NotificationMessageModel notificationQuestionModel = new NotificationMessageModel();
		notificationQuestionModel.setBloodgroup(bloodgroup);
		notificationQuestionModel.setRequestid(donorreqid);
		notificationQuestionModel.setMessage(getMessage("asking.user.to.set.complete.status"));
		sendCommonNotification(requestId,notificationQuestionModel, devicesList,notificationType);
	}
	
	public void sendMessageNotification(String name, ArrayList<NotificationDTO> devicesList,MessagesDTO message,int notificationType) {

		try {

			sendCommonNotification(name, devicesList,message,notificationType);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	public void sendCommonNotification(String name, ArrayList<NotificationDTO> devicesList,MessagesDTO message,int notificationType) {

		try {

			System.out.println("-devices size--->" + devicesList.size());

			ArrayList<String> androidGcmList = new ArrayList<String>();
			ArrayList<String> iOSGcmList = new ArrayList<String>();

			for (NotificationDTO ideviceListObject : devicesList) {

				if (ideviceListObject.getDevicetype() == Constants.ANDROID_DEVICE_TYPE) {
					androidGcmList.add(ideviceListObject.getGcmid());
					System.out.println(androidGcmList.get(0));

				}
				if (ideviceListObject.getDevicetype() == Constants.iOS_DEVICE_TYPE) {
					iOSGcmList.add(ideviceListObject.getGcmid());
					System.out.println(iOSGcmList.get(0));

				}
			}

			// Android Notification
			if (androidGcmList.size() > 0) {

				//NotificationBodyModel notificationBodyModel = new NotificationBodyModel();
				
				
				//notificationBodyModel.setBloodGroup();
				//notificationBodyModel.setDonorreqid();
				//notificationBodyModel.setBody();
				//notificationBodyModel.setSound("default");
				//notificationBodyModel.setTitle(getMessage("appname"));
				
				
				MessageNotificationDataModel data=new MessageNotificationDataModel();
				data.setMessage(message.getMessage());
				data.setDonorreqid(message.getDonorreqid());
				data.setBody(name);
				data.setNotificationType(notificationType);
				data.setMessageSenderId(message.getMessageSenderId());
				data.setMessageSentDate(Utilities.convertDateAndTimeFormat(message.getMessageSentDate()));
				
				MessageNotificationRootModel rootObj = new MessageNotificationRootModel();
				rootObj.setPriority("high");
				rootObj.setRegistration_ids(androidGcmList);
				//rootObj.setNotification(notificationBodyModel);
				rootObj.setData(data);

				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				String messageMain = ow.writeValueAsString(rootObj);
				sendNotificationtoDevice(messageMain, Constants.ANDROID_GCM_API_KEY);

			}

			// iOS Notification
			if (iOSGcmList.size() > 0) {

				//NotificationBodyModel notificationBodyModel = new NotificationBodyModel();
				
				
				//notificationBodyModel.setBloodGroup();
				//notificationBodyModel.setDonorreqid();
				//notificationBodyModel.setBody();
				//notificationBodyModel.setSound("default");
				//notificationBodyModel.setTitle(getMessage("appname"));
				
				
				MessageNotificationDataModel data=new MessageNotificationDataModel();
				data.setMessage(message.getMessage());
				data.setDonorreqid(message.getDonorreqid());
				data.setBody(name);
				data.setNotificationType(notificationType);
				data.setMessageSenderId(message.getMessageSenderId());
				data.setMessageSentDate(Utilities.convertDateAndTimeFormat(message.getMessageSentDate()));
				
				MessageNotificationRootModel rootObj = new MessageNotificationRootModel();
				rootObj.setPriority("high");
				rootObj.setRegistration_ids(iOSGcmList);
				//rootObj.setNotification(notificationBodyModel);
				rootObj.setData(data);

				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				String messageMain = ow.writeValueAsString(rootObj);
				sendNotificationtoDevice(messageMain, Constants.IOS_GCM_API_KEY);

			}

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	public void sendDonorLocationDetails(String name,ArrayList<NotificationDTO> devicesList,TrackDonarLocation trackDonarLocation) {

		try {
			sendDonorLocationNotification(name, devicesList,trackDonarLocation);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void sendDonorLocationNotification(String name,ArrayList<NotificationDTO> devicesList,TrackDonarLocation trackDonarLocation) {

		try {

			System.out.println("-devices size--->" + devicesList.size());

			ArrayList<String> androidGcmList = new ArrayList<String>();
			ArrayList<String> iOSGcmList = new ArrayList<String>();

			for (NotificationDTO ideviceListObject : devicesList) {

				if (ideviceListObject.getDevicetype() == Constants.ANDROID_DEVICE_TYPE) {
					androidGcmList.add(ideviceListObject.getGcmid());

				}
			}

			// Android Notification
			if (androidGcmList.size() > 0) {

				DonorLocationDetailsModel notificationBodyModel = new DonorLocationDetailsModel();
				
				
				notificationBodyModel.setDonorId(trackDonarLocation.getDonarId());
				notificationBodyModel.setLatitude(trackDonarLocation.getCurrentLatitude());
				notificationBodyModel.setSound("default");
				notificationBodyModel.setTitle(getMessage("appname"));
				notificationBodyModel.setBody(name);
				notificationBodyModel.setLongitude(trackDonarLocation.getCurrentLongitude());
				
				DonorLocationDetailsRootModel rootObj = new DonorLocationDetailsRootModel();
				rootObj.setPriority("high");
				rootObj.setRegistration_ids(androidGcmList);
				rootObj.setNotification(notificationBodyModel);
				
				

				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				String message = ow.writeValueAsString(rootObj);
				sendNotificationtoDevice(message, Constants.ANDROID_GCM_API_KEY);

			}

			// iOS Notification

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	*/
	public void sendCommonNotification(int requestId,
			NotificationMessageModel notificationQuestionModel,
			ArrayList<NotificationDTO> devicesList,int notificationType) {

		try {

			System.out.println("-devices size--->" + devicesList.size());

			ArrayList<String> androidGcmList = new ArrayList<String>();
			ArrayList<String> iOSGcmList = new ArrayList<String>();

			for (NotificationDTO ideviceListObject : devicesList) {

				if (ideviceListObject.getDevicetype() == Constants.ANDROID_DEVICE_TYPE) {
					androidGcmList.add(ideviceListObject.getGcmid());
					System.out.println(androidGcmList.get(0));

				}
				if (ideviceListObject.getDevicetype() == Constants.iOS_DEVICE_TYPE) {
					iOSGcmList.add(ideviceListObject.getGcmid());
					System.out.println(iOSGcmList.get(0));

				}
			}

			// Android Notification
			if (androidGcmList.size() > 0) {

				//NotificationBodyModel notificationBodyModel = new NotificationBodyModel();
				
				
				//notificationBodyModel.setBloodGroup();
				//notificationBodyModel.setDonorreqid();
				//notificationBodyModel.setBody();
				//notificationBodyModel.setSound("default");
				//notificationBodyModel.setTitle(getMessage("appname"));
				
				
				NotificationDataModel data=new NotificationDataModel();
				
				data.setBloodGroup(notificationQuestionModel.getBloodgroup());
				data.setDonorreqid(notificationQuestionModel.getRequestid());
				data.setRequestId(requestId);
				data.setBody(notificationQuestionModel.getMessage());
				data.setNotificationType(notificationType);
				
				NotificationRootModel rootObj = new NotificationRootModel();
				rootObj.setPriority("high");
				rootObj.setRegistration_ids(androidGcmList);
				//rootObj.setNotification(notificationBodyModel);
				rootObj.setData(data);

				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				String message = ow.writeValueAsString(rootObj);
				sendNotificationtoDevice(message, Constants.ANDROID_GCM_API_KEY);

			}

			// iOS Notification
			if (iOSGcmList.size() > 0) {

				//NotificationBodyModel notificationBodyModel = new NotificationBodyModel();
				
				
				//notificationBodyModel.setBloodGroup();
				//notificationBodyModel.setDonorreqid();
				//notificationBodyModel.setBody();
				//notificationBodyModel.setSound("default");
				//notificationBodyModel.setTitle(getMessage("appname"));
				
				
				NotificationDataModel data=new NotificationDataModel();
				data.setBloodGroup(notificationQuestionModel.getBloodgroup());
				data.setDonorreqid(notificationQuestionModel.getRequestid());
				data.setBody(notificationQuestionModel.getMessage());
				data.setNotificationType(notificationType);
				
				NotificationRootModel rootObj = new NotificationRootModel();
				rootObj.setPriority("high");
				rootObj.setRegistration_ids(iOSGcmList);
				//rootObj.setNotification(notificationBodyModel);
				rootObj.setData(data);

				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
				String message = ow.writeValueAsString(rootObj);
				sendNotificationtoDevice(message, Constants.IOS_GCM_API_KEY);

			}

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void sendNotificationtoDevice(String json, String apiKey) {

		try {

			URL obj = new URL(Constants.FCM_SERVER_URL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Authorization", "key=" + apiKey);

			if (json != null) {
				System.out.println("JSON OBJECT------>"+json);
				con.setDoOutput(true);
				OutputStream os = con.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
				osw.write(json.toString());
				osw.flush();
				osw.close();
			}

			int responseCode = con.getResponseCode();
			System.out.println("POST Response Code :: " + responseCode);

			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("POST request not worked");
			}

		} catch (Throwable t) {
			t.printStackTrace();
		}

	}

}
