package com.ensis.bloodgroup.service.common;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("anotherBean1")
public class AnotherBean1 {
	
	@Autowired
	CommonService commonService;
	

	/**
	 * @param commonService the commonService to set
	 */
	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

	public void printAnotherMessage(){
		System.out.println("------------>Notify Blood Request status from Accepted User    "+new Date());
		//Get the list of Accepted Requests by user today date
		commonService.notifyDonorAcceptedRequestFromUser();
		
	}
	
	
}
