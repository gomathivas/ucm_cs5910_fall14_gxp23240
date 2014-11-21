package edu.ucmo.ase.ecomm.sc.dao;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import edu.ucmo.ase.ecomm.sc.domain.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAllProducts() {
		Session session = sessionFactory.getCurrentSession();
        List<Product> products = null;
        try {
        	products = (List<Product>)session.createQuery("from Product").list();
 
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return products;
	}

	@Override
	public List<Product> findAllProductsByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductByID(Integer productID) {
		Session session = sessionFactory.getCurrentSession();
        return (Product)session.get(Product.class, productID);
	}

	@Override
	public void updateProductByID(Integer productID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
        session.save(product);
	}


	@Override
	public void removeProductByID(Integer productID) {
		Session session = sessionFactory.getCurrentSession();
        
        Product product = (Product)session.get(Product.class, productID);
         
        session.delete(product);
		
	}


	@Override
	public void addProduct(Product product, byte[] bytes) {
		Session session = sessionFactory.getCurrentSession();
		Blob productImage = Hibernate.getLobCreator(sessionFactory.getCurrentSession()).createBlob(bytes);
		product.setProductImage(productImage);
        session.save(product);
	}


	@Override
	public List<Product> findProductsByKeyWord(String searchKeyWord) {
		Session session = sessionFactory.getCurrentSession();
//		entityManager.createQuery("select at from AttendeesVO at where lower(at.user.firstName) LIKE lower(:searchKeyword)",AttendeesVO.class); 
//		from User u where str(u.id) like :userId
        List<Product> products = null;
        try {

        			Query createQuery = session.createQuery("from Product where lower(productName) like lower(:searchKeyword)");
        			createQuery.setParameter("searchKeyword", "%" +searchKeyWord + "%");
        			
                	products = (List<Product>) createQuery.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return products;
	}

}
