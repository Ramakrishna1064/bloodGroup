package com.ensis.bloodgroup.dao.organization;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.ensis.bloodgroup.dao.HibernateUtil;
import com.ensis.bloodgroup.dto.DonarsDTO;
import com.ensis.bloodgroup.dto.NotificationDTO;
import com.ensis.bloodgroup.dto.OrganizationDTO;
import com.ensis.bloodgroup.dto.RequestedDonorsListDTO;
import com.ensis.bloodgroup.dto.UsersDTO;

public class OrganizationDAO {
	@Autowired
	private HibernateUtil hibernateUtil;

	@Autowired
	private SessionFactory sessionFactory;

	public boolean insertOrganizationInformation(OrganizationDTO orgdto) {

		Object obj = hibernateUtil.create(orgdto);
		if (obj != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param organizationid
	 * @return
	 */
	public String getOrganizationName(int organizationid) {

		String organizationName = null;
		try {

			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM OrganizationDTO o WHERE o.organizationid = :organizationid";
			Query query = session.createQuery(hql);
			query.setParameter("organizationid", organizationid);

			List results = query.list();
			Iterator itr = results.iterator();
			session.flush();
			session.clear();
			if (itr.hasNext()) {

				OrganizationDTO organization = (OrganizationDTO) itr.next();
				organizationName = organization.getOrganizationname();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return organizationName;

	}

	/**
	 * 
	 * @param userid
	 * @return
	 */
	public int userExistOrNor(int userId) {

		int userid = 0;
		try {

			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM UsersDTO o WHERE o.userid = :userid";
			Query query = session.createQuery(hql);
			query.setParameter("userid", userId);

			List results = query.list();
			Iterator itr = results.iterator();
			session.flush();
			session.clear();
			if (itr.hasNext()) {

				UsersDTO organization = (UsersDTO) itr.next();
				userid = organization.getUserid();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userid;

	}

	/**
	 * 
	 * @param notification
	 * @return
	 */
	public boolean saveUserNotificationObj(NotificationDTO notification) {

		boolean isValue = checkDeviceRegisteredOrNot(notification);
		if (isValue) {
			NotificationDTO modelObj=new NotificationDTO();
			modelObj.setUserid(notification.getUserid());
			modelObj.setCreatedby(""+notification.getUserid());
			modelObj.setCreateddate(new Date());
			modelObj.setNotificationenable(true);
			modelObj.setDeviceid(notification.getDeviceid());
			modelObj.setDevicetype(notification.getDevicetype());
			modelObj.setGcmid(notification.getGcmid());
			modelObj.setUpdatedby("" + modelObj.getUserid());
			modelObj.setUpdateddate(new Date());
			Object obj = hibernateUtil.create(modelObj);
			if (obj != null)
				return true;
			return false;

		} else {
			return true;
		}

	}

	/**
	 * 
	 * @param userNotificationDTO
	 * @return
	 */
	public boolean checkDeviceRegisteredOrNot(
			NotificationDTO userNotificationDTO) {

		try {

			/*String hql = "FROM NotificationDTO u WHERE "
					+ "u.userid = :userId AND" + " u.deviceid=:deviceId AND"
					+ " u.devicetype=:deviceType";*/
			String hql = "FROM NotificationDTO u WHERE "+ "u.deviceid = :deviceid";
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter("deviceid", userNotificationDTO.getDeviceid());
			//query.setParameter("deviceId", userNotificationDTO.getDeviceid());
			//query.setParameter("deviceType",userNotificationDTO.getDevicetype());

			List<?> results = query.list();
			Iterator<?> itr = results.iterator();
			while (itr.hasNext()) {
				NotificationDTO modelObj = (NotificationDTO) itr.next();
		        session.delete((Object)modelObj);
				System.out.println("Deleted notification with id ======================= "+modelObj.getNotificationid());
				
			}
			session.flush();
			session.clear();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public ArrayList<NotificationDTO> getUserDeviceInfo(int userid) {

		try {
			System.out.println("UserId=================================="+userid);
			ArrayList<NotificationDTO> devicesList = new ArrayList<NotificationDTO>();
			String hql = "FROM NotificationDTO u WHERE " + "u.userid = :userid";
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(hql);
			query.setParameter("userid", userid);

			List<?> results = query.list();
			Iterator<?> itr = results.iterator();
			while (itr.hasNext()) {
				NotificationDTO userNotificationDTO = (NotificationDTO) itr
						.next();
				devicesList.add(userNotificationDTO);
			}
			session.flush();
			session.clear();
			return devicesList;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
	
	public int getUserIdInAcceptedRequest(int donorId)
	{
		int userId=0;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(RequestedDonorsListDTO.class);
		criteria.add(Restrictions.eq("donorid", donorId));
		criteria.add(Restrictions.eq("requeststatus", 2));
		// result will stored in list object.
		List<?> list = criteria.list();
		session.flush();
		session.clear();
		if(list.size()>0)
		{
			userId=((RequestedDonorsListDTO)list.get(0)).getUserId();
		}
		return userId;
	}
	
	
	public int getRequestMainId(int donorreqid)
	{
		int requestId=0;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(RequestedDonorsListDTO.class);
		criteria.add(Restrictions.eq("donorreqid", donorreqid));
		// result will stored in list object.
		List<?> list = criteria.list();
		session.flush();
		session.clear();
		if(list.size()>0)
		{
			requestId=((RequestedDonorsListDTO)list.get(0)).getRequestid();
		}
		return requestId;
	}
	

	/**
	 * 
	 * @param patientid
	 * @return
	 */
	public DonarsDTO getUserInformation(int userId) {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(DonarsDTO.class);
		criteria.add(Restrictions.eq("userid", userId));
		// result will stored in list object.
		List<?> list = criteria.list();
		session.flush();
		session.clear();
		if(list!=null&&list.size()>0)
		{
			return (DonarsDTO)list.get(0);
		}
		else
		{
			return null;
		}
	}

}
