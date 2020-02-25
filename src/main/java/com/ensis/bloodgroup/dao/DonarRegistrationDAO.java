package com.ensis.bloodgroup.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ensis.bloodgroup.dao.common.CommonDAO;
import com.ensis.bloodgroup.dto.AcceptDonarsDTO;
import com.ensis.bloodgroup.dto.DonarsDTO;
import com.ensis.bloodgroup.dto.DonateRequestDTO;
import com.ensis.bloodgroup.dto.MedicalTestDTO;
import com.ensis.bloodgroup.dto.ProfileImageDTO;
import com.ensis.bloodgroup.dto.RequestedDonorsListDTO;
import com.ensis.bloodgroup.dto.UsersDTO;
import com.ensis.bloodgroup.models.DonarRegistrationModel;
import com.ensis.bloodgroup.models.DonerMedicalTests;
import com.ensis.bloodgroup.models.GetDonerProfileModel;
import com.ensis.bloodgroup.models.LocationTrackingObject;
import com.ensis.bloodgroup.utis.LatitudeAndLongitudeWithPincode;
import com.ensis.bloodgroup.utis.MessageResources;
import com.ensis.bloodgroup.utis.Utilities;

@Repository
public class DonarRegistrationDAO extends MessageResources {

	@Autowired
	HibernateUtil hibernateUtil;

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	CommonDAO commonDAO;
	
	public CommonDAO getCommonDAO() {
		return commonDAO;
	}

	/**
	 * @param commonDAO
	 *            the commonDAO to set
	 */
	public void setCommonDAO(CommonDAO commonDAO) {
		this.commonDAO = commonDAO;
	}
	

	/**
	 * 
	 * @param userOj
	 * @return
	 */
	public int insertUserObj(UsersDTO userOj) {

		Object obj = hibernateUtil.create(userOj);
		if (obj != null) {

			Session session = sessionFactory.getCurrentSession();
			int userID = (Integer) session.createCriteria(UsersDTO.class)
					.setProjection(Projections.max("userid")).uniqueResult();
			session.flush();
			session.clear();
			return userID;

		} else {

			return 0;
		}
	}

	/**
	 * 
	 * @param donarsDTO
	 * @return
	 */

	public boolean insertDonarInformation(DonarsDTO donarsDTO) {

		Object obj = hibernateUtil.create(donarsDTO);
		if (obj != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param emailId
	 * @return
	 */
	public long checkEmailExists(String emailId) {

		System.out.println(emailId);
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UsersDTO.class);
		criteria.add(Restrictions.eq("email", emailId));
		criteria.setProjection(Projections.rowCount());
		long count = (Long) criteria.uniqueResult();
		session.flush();
		session.clear();
		System.out.println("count----" + criteria.uniqueResult());
		return count;
	}
	public long checkMobileExists(String mobileNumber) {

		System.out.println(mobileNumber);
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UsersDTO.class);
		criteria.add(Restrictions.eq("mibile", mobileNumber));
		criteria.setProjection(Projections.rowCount());
		long count = (Long) criteria.uniqueResult();
		session.flush();
		session.clear();
		System.out.println("count----" + criteria.uniqueResult());
		return count;
	}

	/**
	 * 
	 * @param userId
	 * @return
	 */
	public int DonerExistOrNot(int userid) {
		int userIdNew = 0;
		try {

			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM UsersDTO d WHERE d.userid = :userid";
			Query query = session.createQuery(hql);
			query.setParameter("userid", userid);

			List results = query.list();
			Iterator itr = results.iterator();
			session.flush();
			session.clear();
			if (itr.hasNext()) {
				System.out.println("Doner Exist or not");
				UsersDTO pbliling = (UsersDTO) itr.next();
				userIdNew = pbliling.getUserid();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userIdNew;
	}
	
	
	
	public int getUserIdWithMobileNumber(String mibile) {
		int userIdNew = 0;
		try {

			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM UsersDTO d WHERE d.mibile = :mibile";
			Query query = session.createQuery(hql);
			query.setParameter("mibile", mibile);

			List results = query.list();
			Iterator itr = results.iterator();
			session.flush();
			session.clear();
			if (itr.hasNext()) {
				System.out.println("Doner Exist or not");
				UsersDTO pbliling = (UsersDTO) itr.next();
				userIdNew = pbliling.getUserid();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return userIdNew;
	}
	public int getUserIdWithMobileNumberAndPassword(String mibile,String password) {
		int status = -3;
		try {

			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM UsersDTO d WHERE d.mibile = :mibile AND d.password= :password";
			Query query = session.createQuery(hql);
			query.setParameter("mibile", mibile);
			query.setParameter("password", password);

			List results = query.list();
			Iterator itr = results.iterator();
			session.flush();
			session.clear();
			if (itr.hasNext()) {
				System.out.println("Doner Exist or not");
				UsersDTO pbliling = (UsersDTO) itr.next();
				status = pbliling.getIsActive();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	/**
	 * 
	 * @param donarid
	 * @param donar
	 * @return
	 */
	public int createProfile(int userId, DonarsDTO donar) {
		System.out.println("====================came");
		int response = 0;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(DonarsDTO.class);
		criteria.add(Restrictions.eq("userid", userId));
		// result will stored in list object.
		List<?> list = criteria.list();
		if(list.size()>0)
		{
			DonarsDTO donarInfo = (DonarsDTO) list.get(0);
			session.flush();
			session.clear();
			if (donarInfo != null) {
				System.out.println("====================NotNull");
				if (donar.getFirstname() != null) {
					donarInfo.setFirstname(donar.getFirstname());
				}
				if (donar.getLastname() != null) {
					donarInfo.setLastname(donar.getLastname());
				}
				if (donar.getProfileImageUUID() != null) {
					donarInfo.setProfileImageUUID(donar
							.getProfileImageUUID());
				}
				if (donar.getMobilenumber() != null) {
					donarInfo.setMobilenumber(donar.getMobilenumber());
				}

				if (donar.getAddress1() != null) {
					donarInfo.setAddress1(donar.getAddress1());
				}
				if (donar.getAddress2() != null) {
					donarInfo.setAddress2(donar.getAddress2());
				}
				if (donar.getCity() != null) {
					donarInfo.setCity(donar.getCity());
				}
				if (donar.getCountry() != null) {
					donarInfo.setCountry(donar.getCountry());
				}
				if (donar.getState() != null) {
					donarInfo.setState(donar.getState());
				}
				if (donar.getZip() != null) {
					donarInfo.setZip(donar.getZip());
					String address = donar.getAddress1() + ","
							+ donar.getAddress2() + ","
							+ donar.getCity() + ","
							+ donar.getState() + ","
							+ donar.getZip();
					String LatLang[];
					try {
						LatLang = LatitudeAndLongitudeWithPincode
								.getLatLongPositions(address);
						System.out.println(LatLang[0] + "---" + LatLang[1]);
						donarInfo.setDonarlatitude(LatLang[0]);
						donarInfo.setDonarlongitude(LatLang[1]);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				if (donar.getBloodgroup() != null) {
					donarInfo.setBloodgroup(donar.getBloodgroup());
				}
				if (donar.getAlternatemobilenumber() != null) {
					donarInfo.setAlternatemobilenumber(donar
							.getAlternatemobilenumber());
				}
				if (donar.getGender() != null) {
					donarInfo.setGender(donar.getGender());
				}
				if (donar.getAge() != null) {
					donarInfo.setAge(donar.getAge());
				}
				if(donar.getLastdonateddate()!=null)
				{
					donarInfo.setLastdonateddate(donar.getLastdonateddate());
				}
				if(donar.getGovernmentid()!=null&&donar.getGovernmentid()!="")
				{
					donarInfo.setGovernmentid(donar.getGovernmentid());
				}

				hibernateUtil.update(donarInfo);
				response = 1;

			}
		}
		

		return response;
	}

	
	public int updateUserDetails(int userId,DonarRegistrationModel user)
	{
		int response=0;
		Session session = sessionFactory.getCurrentSession();
		UsersDTO userInfo = (UsersDTO) session.get(UsersDTO.class, userId);
		session.flush();
		session.clear();
		if (userInfo != null) {
			userInfo.setFirstname(user.getFirstname());
			userInfo.setLastname(user.getLastname());
			hibernateUtil.update(userInfo);
			response = 1;
		}
		return response;
	}
	
	public String getUserEmailbyUserid(int userid) {
		String email = "";
		try {

			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM UsersDTO u WHERE u.userid = :userid";
			Query query = session.createQuery(hql);
			query.setParameter("userid", userid);

			List results = query.list();
			Iterator itr = results.iterator();
			session.flush();
			session.clear();
			if (itr.hasNext()) {
				UsersDTO user = (UsersDTO) itr.next();
				email = user.getEmail();
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return email;
	}
	
	public GetDonerProfileModel getDonerProfile(int userid) {
		GetDonerProfileModel profile = null;

		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM DonarsDTO d WHERE d.userid=:userid";
		Query query = session.createQuery(hql);
		query.setParameter("userid", userid);
		session.flush();
		session.clear();

		List results = query.list();
		
		Iterator itr = results.iterator();
		if (itr.hasNext()) {
			profile = new GetDonerProfileModel();
			DonarsDTO donar = (DonarsDTO) itr.next();
			profile.setEmailId(getUserEmailbyUserid(userid));
			profile.setFirstname(donar.getFirstname());
			profile.setLastname(donar.getLastname());
			profile.setBloodgroup(donar.getBloodgroup());
			profile.setGender(donar.getGender());
			profile.setAge(donar.getAge());
			profile.setMobile(donar.getMobilenumber());
			profile.setAlternatemobilenumber(donar.getAlternatemobilenumber());
			profile.setCity(donar.getCity());
			profile.setState(donar.getState());
			profile.setCountry(donar.getCountry());
			profile.setZip(donar.getZip());
			profile.setAddress1(donar.getAddress1());
			profile.setAddress2(donar.getAddress2());
			profile.setGovernmentID(donar.getGovernmentid());
			profile.setLatitude(donar.getDonarlatitude());
			profile.setLongitude(donar.getDonarlongitude());
			profile.setImageUrl(getMessage("imageUrlPath")
					+ donar.getProfileImageUUID());
			if (donar.getLastdonateddate() != null) {
				profile.setLastdonateddate(""
						+ Utilities.convertOnlyDateFormat(donar
								.getLastdonateddate()));
			} else {
				profile.setLastdonateddate(null);
			}

			if (donar.getBloodgroup() == null && donar.getGender() == null) {
				profile.setProfileCompleted(false);
			} else {
				profile.setProfileCompleted(true);
			}
			ArrayList<DonerMedicalTests> medicacltests = new ArrayList<DonerMedicalTests>();
			ArrayList<MedicalTestDTO> medicalTests = commonDAO.getMedicalTest(donar.getUserid());
			System.out.println("size--" + medicalTests.size());
			for (MedicalTestDTO dto : medicalTests) {
				DonerMedicalTests test = new DonerMedicalTests();
				test.setComments(dto.getComments());
				test.setMedicaltestname(dto.getMedicaltestname());
				test.setResult(dto.getResult());
				test.setDescription(dto.getDescription());
				test.setTestdate(""+ Utilities.convertDateAndTimeFormat(dto.getTestdate()));
				test.setMedicaltestid(dto.getMedicaltestid());
				medicacltests.add(test);
			}
			profile.setMedicacltests(medicacltests);

		}

		return profile;

	}

	public int getDonorIdForUser(int userid) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM DonarsDTO d WHERE d.userid=:userid";
		Query query = session.createQuery(hql);
		query.setParameter("userid", userid);
		session.flush();
		session.clear();

		List results = query.list();
		Iterator itr = results.iterator();
		if (itr.hasNext()) {

			DonarsDTO donar = (DonarsDTO) itr.next();
			return donar.getDonarid();

		}

		return 0;

	}
	
	
	/**
	 * 
	 * @param donarid
	 * @param donar
	 * @return
	 */
	public int updateProfile(int donarid, DonarsDTO donar) {
		int response = 0;
		Session session = sessionFactory.getCurrentSession();
		DonarsDTO donarInfo = (DonarsDTO) session.get(DonarsDTO.class, donarid);
		session.flush();
		session.clear();
		if (donarInfo != null) {
			donarInfo.setAddress1(donar.getAddress1());
			donarInfo.setAddress1(donar.getAddress1());
			donarInfo.setAddress2(donar.getAddress2());
			donarInfo.setCity(donar.getCity());
			donarInfo.setCountry(donar.getCountry());
			donarInfo.setState(donar.getState());
			donarInfo.setZip(donar.getZip());
			donarInfo.setBloodgroup(donar.getBloodgroup());
			// donarInfo.setMobilenumber(donar.getMobilenumber());
			donarInfo
					.setAlternatemobilenumber(donar.getAlternatemobilenumber());
			donarInfo.setAge(donar.getAge());
			donarInfo.setGender(donar.getGender());
			donarInfo.setState(donar.getState());

			hibernateUtil.update(donarInfo);
			response = 1;
		}
		return response;
	}

	/**
	 * 
	 * @param doanr
	 * @return
	 */
	public int trackLocation(DonarsDTO doanr) {
		int response = 0;

		try {
			Session session = sessionFactory.getCurrentSession();
			DonarsDTO donarInfo = (DonarsDTO) session.get(DonarsDTO.class,getDonorIdForUser(doanr.getDonarid()));
			donarInfo.setCurrentlatitude(doanr.getCurrentlatitude());
			donarInfo.setCurrentlongitude(doanr.getCurrentlongitude());
			hibernateUtil.update(donarInfo);
			response = 1;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}

	/**
	 * 
	 * @param donarid
	 * @return
	 */
	public List<?> getDonerHistory(int donarid) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(RequestedDonorsListDTO.class);
		criteria.add(Restrictions.eq("donorid", donarid));
		criteria.add(Restrictions.eq("requeststatus", 5));
		// result will stored in list object.
		List<?> list = criteria.list();
		session.flush();
		session.clear();
		return list;
		
	}
	
	public DonateRequestDTO getRequestItem(int requestId)
	{
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(DonateRequestDTO.class);
		criteria.add(Restrictions.eq("requestid", requestId));
		// result will stored in list object.
		List<?> list = criteria.list();
		session.flush();
		session.clear();
		if(list!=null&&list.size()>0)
		{
			DonateRequestDTO request=(DonateRequestDTO)list.get(0);
			return request;
		}
		return null;
	}

	/**
	 * 
	 * @param donar
	 * @return
	 */
	public LocationTrackingObject getLocation(DonarsDTO donar) {

		LocationTrackingObject obj = new LocationTrackingObject();
		Session session = sessionFactory.getCurrentSession();
		DonarsDTO donarInfo = (DonarsDTO) session.get(DonarsDTO.class,getDonorIdForUser(donar.getDonarid()));
		donarInfo.getCurrentlatitude();
		donarInfo.getCurrentlongitude();
		donarInfo.getDonarlatitude();
		donarInfo.getDonarlongitude();
		obj.setCurrentLatitude(donarInfo.getCurrentlatitude());
		obj.setCurrentLongitude(donarInfo.getCurrentlongitude());
		obj.setDonarLatitude(donarInfo.getDonarlatitude());
		obj.setDonarLongitude(donarInfo.getDonarlongitude());

		return obj;

	}

	/**
	 * 
	 * @param fileName
	 * @return
	 */
	public int uploadProfileImage(String fileName) {

		int imgid = 0;
		try {
			ProfileImageDTO profileimage = new ProfileImageDTO();
			profileimage.setImagename(fileName);
			profileimage.setCreatedby("admin");
			profileimage.setCreateddate(new Date());
			hibernateUtil.create(profileimage);

			Session session = sessionFactory.getCurrentSession();
			imgid = (Integer) session.createCriteria(ProfileImageDTO.class)
					.setProjection(Projections.max("imageid")).uniqueResult();
			System.out.println("maxid-->" + imgid);
			session.flush();
			session.clear();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return imgid;
	}

	/**
	 * 
	 * @param requestid
	 * @param donar
	 * @return
	 */
	public int acceptOrRejectRequest(int requestid, int donarid,
			int approvestatus) {
		int response = 0;
		Session session = sessionFactory.getCurrentSession();
		DonateRequestDTO requestInfo = (DonateRequestDTO) session.get(
				DonateRequestDTO.class, requestid);
		session.flush();
		session.clear();
		if (requestInfo != null) {
			//requestInfo.setDonarid(donarid);
			requestInfo.setRequeststatusid(approvestatus);

			hibernateUtil.update(requestInfo);
			response = 1;
		}
		return response;
	}

	/**
	 * 
	 * @param acceptdoners
	 * @return
	 */
	public boolean donarAcceptRequest(AcceptDonarsDTO acceptdoners) {
		Object obj = hibernateUtil.create(acceptdoners);
		if (obj != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param imageid
	 * @return
	 */
	public String getImageName(int imageid) {
		String imageName = null;

		try {

			Session session = sessionFactory.getCurrentSession();
			String hql = "FROM ProfileImageDTO p WHERE p.imageid = :imageid";
			Query query = session.createQuery(hql);
			query.setParameter("imageid", imageid);

			List results = query.list();
			Iterator itr = results.iterator();
			session.flush();
			session.clear();
			if (itr.hasNext()) {
				System.out.println("Doner Exist or not");
				ProfileImageDTO image = (ProfileImageDTO) itr.next();
				imageName = image.getImagename();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return imageName;
	}

	/**
	 * 
	 * @param testsDto
	 * @return
	 */
	public boolean insertMedicaltests(MedicalTestDTO testsDto) {
		Session session = sessionFactory.getCurrentSession();
		Object obj = hibernateUtil.create(testsDto);
		session.flush();
		session.clear();
		if (obj != null) {
			return true;
		} else {
			return false;
		}

	}
	
	public UsersDTO getUser(int userId) {

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UsersDTO.class);
		criteria.add(Restrictions.eq("userid", userId));
		// result will stored in list object.
		List<?> list = criteria.list();
		session.flush();
		session.clear();
		if(list!=null&&list.size()>0)
		{
			return (UsersDTO)list.get(0);
		}
		else
		{
			return null;
		}
		
	}
	public boolean updateUserPassword(UsersDTO userObj) {
        Object obj = this.hibernateUtil.update((Object)userObj);
        if (obj != null) {
            return true;
        }
        return false;
    }
	
	
	public List<?> getSingleMedicalTest(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(MedicalTestDTO.class);
        criteria.add((Criterion)Restrictions.eq("medicaltestid", id));
        List list = criteria.list();
        session.flush();
        session.clear();
        return list;
    }

    public boolean deleteMedicalTestReport(MedicalTestDTO medicalTest) {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(medicalTest);
        session.flush();
        session.clear();
        return true;
    }
    
    public boolean updateMedicalTestReport(MedicalTestDTO medicalTest) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(medicalTest);
        session.flush();
        session.clear();
        return true;
    }

}
