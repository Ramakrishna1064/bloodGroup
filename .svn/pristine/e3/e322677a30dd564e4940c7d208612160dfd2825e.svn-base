package com.ensis.bloodgroup.service.common;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ScheduledJob1 extends QuartzJobBean{

	private AnotherBean1 anotherBean1;
	
	
	
	/**
	 * @param anotherBean1 the anotherBean1 to set
	 */
	public void setAnotherBean1(AnotherBean1 anotherBean1) {
		this.anotherBean1 = anotherBean1;
	}



	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		anotherBean1.printAnotherMessage();
		
	}

}
