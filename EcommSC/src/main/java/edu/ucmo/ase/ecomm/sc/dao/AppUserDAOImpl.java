package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import edu.ucmo.ase.ecomm.sc.domain.Address;
import edu.ucmo.ase.ecomm.sc.domain.AddressType;
import edu.ucmo.ase.ecomm.sc.domain.AppRole;
import edu.ucmo.ase.ecomm.sc.domain.AppUser;

@Repository
public class AppUserDAOImpl implements AppUserDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(AppUserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addAppUser(AppUser p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Person saved successfully, AppUser Details="+p);
	}

	@Override
	public void updateAppUser(AppUser p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, AppUser Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AppUser> listAppUser() {
		Session session = this.sessionFactory.getCurrentSession();
		List<AppUser> personsList = session.createQuery("from Person").list();
		for(AppUser p : personsList){
			logger.info("Person List::"+p);
		}
		return personsList;
	}

	@Override
	public AppUser getAppUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		AppUser p = (AppUser) session.load(AppUser.class, new Integer(id));
		logger.info("Person loaded successfully, Person details="+p);
		return p;
	}

	@Override
	public void removeAppUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		AppUser p = (AppUser) session.load(AppUser.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
	}

	@Override
	public AppUser getAppUserByUserName(String userName) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "FROM AppUser au WHERE au.userName='" + userName + "'";
		Query query = session.createQuery(hql);
		List results = query.list();
		
		if(results.size() == 0)	{
			return null;
		}
		
		return (AppUser)results.get(0);
	}

	@Override
	public AddressType findAddressTypeByCode(String addressTypeCode) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "FROM AddressType at WHERE at.addressTypeCode='" + addressTypeCode + "'";
		Query query = session.createQuery(hql);
		List results = query.list();
		
		if(results.size() == 0)	{
			return null;
		}
		
		return (AddressType)results.get(0);
	}

	@Override
	public AppRole findAppRoleByCode(String appRoleCode) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "FROM AppRole ar WHERE ar.appRoleCode='" + appRoleCode + "'";
		Query query = session.createQuery(hql);
		List results = query.list();
		
		if(results.size() == 0)	{
			return null;
		}
		
		return (AppRole)results.get(0);
	}

	@Override
	public void addAddress(Address address) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(address);
		logger.info("Address saved successfully, address Details="+ address);
		
	}

}
