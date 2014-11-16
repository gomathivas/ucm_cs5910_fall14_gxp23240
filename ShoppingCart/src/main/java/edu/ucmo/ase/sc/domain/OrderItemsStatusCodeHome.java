package edu.ucmo.ase.sc.domain;

// default package
// Generated Oct 14, 2014 8:17:09 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class OrderItemsStatusCode.
 * @see .OrderItemsStatusCode
 * @author Hibernate Tools
 */
public class OrderItemsStatusCodeHome {

	private static final Log log = LogFactory
			.getLog(OrderItemsStatusCodeHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(OrderItemsStatusCode transientInstance) {
		log.debug("persisting OrderItemsStatusCode instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(OrderItemsStatusCode instance) {
		log.debug("attaching dirty OrderItemsStatusCode instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OrderItemsStatusCode instance) {
		log.debug("attaching clean OrderItemsStatusCode instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(OrderItemsStatusCode persistentInstance) {
		log.debug("deleting OrderItemsStatusCode instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OrderItemsStatusCode merge(OrderItemsStatusCode detachedInstance) {
		log.debug("merging OrderItemsStatusCode instance");
		try {
			OrderItemsStatusCode result = (OrderItemsStatusCode) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OrderItemsStatusCode findById(java.math.BigDecimal id) {
		log.debug("getting OrderItemsStatusCode instance with id: " + id);
		try {
			OrderItemsStatusCode instance = (OrderItemsStatusCode) sessionFactory
					.getCurrentSession().get("OrderItemsStatusCode", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(OrderItemsStatusCode instance) {
		log.debug("finding OrderItemsStatusCode instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("OrderItemsStatusCode")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
