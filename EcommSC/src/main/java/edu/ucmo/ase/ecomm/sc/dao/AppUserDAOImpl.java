package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

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
		logger.info("Person saved successfully, Person Details="+p);
	}

	@Override
	public void updateAppUser(AppUser p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, Person Details="+p);
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

}
