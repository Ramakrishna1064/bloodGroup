/**
 * 
 */
package com.ensis.bloodgroup.controller.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ensis.bloodgroup.models.BloodDonateRequestModel;
import com.ensis.bloodgroup.models.DonarRegistrationModel;
import com.ensis.bloodgroup.models.StatusObject;
import com.ensis.bloodgroup.models.UserNotificationModel;
import com.ensis.bloodgroup.service.organization.OrganizationService;

/**
 * @author Ensis
 *
 */
@Controller
public class OrganizationController {

	@Autowired
	OrganizationService organizationService;

	/**
	 * @param organizationService
	 *            the organizationService to set
	 */
	public void setOrganizationService(OrganizationService organizationService) {
		this.organizationService = organizationService;
	}

	@RequestMapping(value = "/User/organizationRegistration", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public StatusObject registerPatient(
			@RequestBody DonarRegistrationModel donarRegistrationModel) {

		return null;
	}

	@RequestMapping(value = "/User/sendDonarRequest", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public StatusObject sendDonarRequest(
			@RequestBody BloodDonateRequestModel BloodDonateRequestModel) {

		return null;
	}
	
	

	/**
	 * 
	 * @param userNotificationModel
	 * @return
	 */
	@RequestMapping(value = "/User/addDevice", method = RequestMethod.POST, headers = { "Content-type=application/json" },produces = { "application/json" })
	@ResponseBody
	public StatusObject addDevice(
			@RequestBody UserNotificationModel userNotificationModel) {
		return organizationService.registerUserDevice(userNotificationModel);
	}
	
}
