/**
 * 
 */
package com.ensis.bloodgroup.controller.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ensis.bloodgroup.dto.UsersDTO;
import com.ensis.bloodgroup.models.DonarLoginStatusModel;
import com.ensis.bloodgroup.models.EmailVerify;
import com.ensis.bloodgroup.models.RequiredDonorToSendRequestModel;
import com.ensis.bloodgroup.models.StatusObject;
import com.ensis.bloodgroup.service.common.CommonService;

/**
 * @author Ensis
 *
 */
@Controller
public class CommonController {

	@Autowired
	CommonService commonService;

	/**
	 * @param commonService
	 *            the commonService to set
	 */
	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

	/**
	 * 
	 * @param userObj
	 * @return
	 */
	@RequestMapping(value = "/User/DonarLogin", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public DonarLoginStatusModel validatePhysicianLogin(
			@RequestBody UsersDTO userObj) {
		// return commonService.validatePhysicianLogin(userObj);
		return commonService.validateDonorLogin(userObj);
	}
	
	@RequestMapping(value = "/User/SendBloodRequestToTheDonors", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public StatusObject sendBloodRequest(@RequestBody RequiredDonorToSendRequestModel requiredDonorToSendRequestModel) {

		return commonService.sendRequestsToTheDonors(requiredDonorToSendRequestModel);
	}
	

	/**
	 * 
	 * @param latitude
	 * @param longitude
	 * @param bloodGroup
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/User/searchBloodGroup", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public List<?> getPhysiciansList(HttpServletRequest request)
			throws Exception {

		String latitude = request.getHeader("latitude");
		String longitude = request.getHeader("longitude");
		String bloodGroup = request.getHeader("bloodGroup");
		int bloodQuantity = Integer.parseInt(request.getHeader("bloodQuantity"));
		int userId = Integer.parseInt(request.getHeader("userId"));
		String datebloodrequired = request.getHeader("dateBloodRequired");

		if (latitude != null && longitude != null) {

			// calculate distance
			System.out.println("distance calculation");
			return commonService.getDonersListDistanceCalculation(userId,latitude,
					longitude, bloodGroup, bloodQuantity,
					datebloodrequired);

		} else {

			// no need consider
			System.out.println("no distance calculation");

			return commonService.getDonaresListWithOutDistance(userId,bloodGroup,bloodQuantity, datebloodrequired);
		}

		/*
		 * @RequestHeader String latitude,
		 * 
		 * @RequestHeader String longitude, @RequestHeader String bloodGroup,
		 * 
		 * @RequestHeader int userid, @RequestHeader int bloodQuantity,
		 * 
		 * @RequestHeader String datebloodrequired
		 */

		// return null;
	}

	@RequestMapping(value = "/emailVerify", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public StatusObject emailVerify(@RequestBody EmailVerify emailVerify)
			throws Exception {

		return commonService.verifyEmail(emailVerify.getEmail());
	}

}
