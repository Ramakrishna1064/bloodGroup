/**
 * 
 */
package com.ensis.bloodgroup.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ensis.bloodgroup.dto.MedicalTestDTO;
import com.ensis.bloodgroup.models.ChangeUserPasswordModel;
import com.ensis.bloodgroup.models.DonarAcceptRequestModel;
import com.ensis.bloodgroup.models.DonarLoginStatusModel;
import com.ensis.bloodgroup.models.DonarRegistrationModel;
import com.ensis.bloodgroup.models.DonorHistoryModel;
import com.ensis.bloodgroup.models.GetDonerProfileModel;
import com.ensis.bloodgroup.models.GetStatusModel;
import com.ensis.bloodgroup.models.ProfileUploadImageStatusModel;
import com.ensis.bloodgroup.models.StatusObject;
import com.ensis.bloodgroup.service.DonarRegistrationService;
import com.ensis.bloodgroup.utis.MessageResources;

/**
 * @author Ensis
 *
 */
@Controller
public class DonarRegistrationController extends MessageResources{

	@Autowired
	DonarRegistrationService donarRegistrationService;
	
	@Autowired
    private ConsumerTokenServices consumerTokenServices;
	
	
	public void setConsumerTokenServices(ConsumerTokenServices consumerTokenServices) {
		this.consumerTokenServices = consumerTokenServices;
	}

	/**
	 * @param donarRegistrationService
	 *            the donarRegistrationService to set
	 */
	public void setDonarRegistrationService(
			DonarRegistrationService donarRegistrationService) {
		this.donarRegistrationService = donarRegistrationService;
	}

	/**
	 * 
	 * @param donarRegistrationModel
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/donarRegistration", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public DonarLoginStatusModel registerPatient(
			@RequestBody DonarRegistrationModel donarRegistrationModel)
			throws Exception {

		return donarRegistrationService
				.donarRegistration(donarRegistrationModel);
	}
	
	@RequestMapping(value = "/updateUserActiveStatus", method = RequestMethod.POST, produces = { "application/json" })
	@ResponseBody
	public StatusObject updateUserActiveStatus(@RequestHeader int userId,@RequestHeader int status) {

		return donarRegistrationService.updateUserActiveStatusService(userId,status);
	}
	
	@RequestMapping(value = "/getUserIdForForgotPassword", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public DonarLoginStatusModel getUserIdForForgotPassword(@RequestHeader String mobileNumber) {

		return donarRegistrationService.getUserIdForForgotPasswordService(mobileNumber);
	}
	
	@RequestMapping(value = "/getUserActiveStatus", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public GetStatusModel getUserActiveStatus(@RequestHeader String mobileNumber,@RequestHeader String password) {

		return donarRegistrationService.getUserActiveStatusService(mobileNumber,password);
	}
	
	@RequestMapping(value={"/changePasswordIfForgotPassword"}, method={RequestMethod.POST}, headers={"Content-type=application/json"}, produces={"application/json"})
    @ResponseBody
    public StatusObject changePasswordIfForgotPassword(@RequestBody ChangeUserPasswordModel ChangeUserPasswordModel2) {
        return this.donarRegistrationService.changePasswordIfForgotPasswordService(ChangeUserPasswordModel2);
    }
	
	
	@RequestMapping(value={"/User/changePassword"}, method={RequestMethod.POST}, headers={"Content-type=application/json"}, produces={"application/json"})
    @ResponseBody
    public StatusObject changePassword(@RequestBody ChangeUserPasswordModel ChangeUserPasswordModel2) {
        return this.donarRegistrationService.changePassword(ChangeUserPasswordModel2);
    }

	
	
	
	
	/**
	 * 
	 * @param donarRegistrationModel
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/User/donarCreateProfile", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public StatusObject createProfile(
			@RequestBody DonarRegistrationModel donarRegistrationModel)
			throws Exception {

		return donarRegistrationService
				.creteDonerProfile(donarRegistrationModel);
	}

	/**
	 * 
	 * @param donarRegistrationModel
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/User/donarUpdateProfile", method = RequestMethod.POST,headers = { "Content-type=application/json" },
			produces = { "application/json" })
	@ResponseBody
	public StatusObject updateProfile(@RequestBody DonarRegistrationModel donarRegistrationModel)
			throws Exception {

		return donarRegistrationService
				.updateDonerProfile(donarRegistrationModel);
	}

	@RequestMapping(value = "/User/updateMedicalTestReport", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public StatusObject updateMedicalTestReport(@RequestBody MedicalTestDTO test)throws Exception {

		return donarRegistrationService.updateMedicalTestReport(test);
	}
	
	
	/**
	 * 
	 * @param donerid
	 * @return
	 */
	@RequestMapping(value = "/User/donarGetProfile", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public GetDonerProfileModel donarGetProfile(@RequestHeader int userId) {

		return donarRegistrationService.getDonerProfile(userId);
	}

	/**
	 * 
	 * @param trackDonarLocation
	 * @return
	 */
/*	@RequestMapping(value = "/User/trackDonarLocation", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public LocationTrackingObject trackDonarLocation(
			@RequestBody TrackDonarLocation trackDonarLocation) {

		return donarRegistrationService.trackDonarLocation(trackDonarLocation);
	}
	*/
	
	@RequestMapping(value = "/User/deleteMedicalTestReport", method = RequestMethod.POST, produces = { "application/json" })
	@ResponseBody
	public StatusObject deleteMedicalTestReport(@RequestHeader int medicalTestId) {

		return donarRegistrationService.deleteMedicalTestReport(medicalTestId);
	}
	
	
	
	
	
	
	
	
	
	

	/**
	 * 
	 * @param trackDonarLocation
	 * @return
	 */
	@RequestMapping(value = "/User/donarHistory", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public List<DonorHistoryModel> donarHistory(@RequestHeader int donorId) {

		return donarRegistrationService.getDonarHistory(donorId);
	}
	
	
	

	/**
	 * 
	 * @param donerid
	 * @return
	 */
	@RequestMapping(value = "/User/acceptRequest", method = RequestMethod.POST, headers = { "Content-type=application/json" }, produces = { "application/json" })
	@ResponseBody
	public GetDonerProfileModel acceptRequest(
			@RequestBody DonarAcceptRequestModel donarAcceptRequestModel) {

		// return donarRegistrationService.getDonerProfile(donerid);
		return null;
	}

	/**
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "/UploadImage", method = RequestMethod.POST)
	public @ResponseBody ProfileUploadImageStatusModel uploadFileHandler(
			@RequestParam("imageName") MultipartFile file,@RequestParam Map<String, String> requestParams) {

		String uuid=requestParams.get("UUID");
		return donarRegistrationService.profileUploadImage(file,uuid);

	}

	/**
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/User/getImage", method = RequestMethod.GET, produces = { "image/jpg" })
	@ResponseBody
	public byte[] getLogo(@RequestParam("fileName") String file)
			throws IOException {

		return donarRegistrationService.getImage(file);
	}
	
	
	
	
	
	@RequestMapping(value = "/User/logout", method = RequestMethod.GET)
	@ResponseBody
	public StatusObject logOut(HttpServletRequest request) {
		StatusObject statusObject=new StatusObject();
		String authHeader = request.getHeader("Authorization");
        if (authHeader != null) {
        	
            String tokenValue = authHeader.replace("bearer", "").trim();
            boolean b=consumerTokenServices.revokeToken(tokenValue);
            if(b)
            {
            	statusObject.setError(false);
            	statusObject.setMessage(getMessage("user.logout.success"));
            }
            else
            {
            	statusObject.setError(true);
            	statusObject.setMessage(getMessage("user.logout.fail"));
            }
            return statusObject;
        }
        else
        {
        	statusObject.setError(true);
        	statusObject.setMessage(getMessage("Authorization.null"));
            return statusObject;
        }
	}

}
