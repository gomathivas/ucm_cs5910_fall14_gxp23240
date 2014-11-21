package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.AppUserDAO;
import edu.ucmo.ase.ecomm.sc.dao.ProductDAO;
import edu.ucmo.ase.ecomm.sc.dao.ShoppingCartDAO;
import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.domain.ShoppingCart;
import edu.ucmo.ase.ecomm.sc.helper.ShoppingCartHelper;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.HeaderModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	private static final Logger logger = LoggerFactory
			.getLogger(ShoppingCartServiceImpl.class);
	
	private ShoppingCartDAO shoppingCartDAO;
	private AppUserDAO appUserDAO;
	private ProductDAO productDAO;

	
	
	@Override
	@Transactional
	public ShoppingCartModel getShoppingCartByProductId(Integer id,
			ShoppingCartListModel scListModel) {
		ShoppingCartModel scm = null;
		List<ShoppingCartModel> scmList = scListModel.getScmList();

		for (ShoppingCartModel scModel : scmList) {
			if (scModel.getProduct().getProductId().compareTo(id) == 0) {
				scm = scModel;
			}
		}

		return scm;
	}
	
	

	@Override
	@Transactional
	public void deActivateSC(ShoppingCartListModel shoppingCartListModel) {
		// TODO Auto-generated method stub
		List<ShoppingCartModel> scmList = shoppingCartListModel.getScmList();
		for (ShoppingCartModel scm : scmList) {
			if(scm.getShoppingCartId() != null)	{
				ShoppingCart sc = this.shoppingCartDAO.findShoppingCartByID(scm.getShoppingCartId());
				sc.setActive(false);
				this.shoppingCartDAO.updateShoppingCart(sc);
			}
		}
	}



	public ShoppingCartDAO getShoppingCartDAO() {
		return shoppingCartDAO;
	}

	public void setShoppingCartDAO(ShoppingCartDAO shoppingCartDAO) {
		this.shoppingCartDAO = shoppingCartDAO;
	}

	@Override
	@Transactional
	public void saveShoppingCart(ShoppingCartListModel scl, HeaderModel hm) {
		if(hm == null)	{
			throw new IllegalArgumentException("HeaderModel cannot be null");
		}
		if(hm.getUser() == null)	{
			throw new IllegalArgumentException("User name cannot be null!!!");
		}
		AppUser appUser = this.appUserDAO.getAppUserByUserName(hm.getUser());
		
		if(scl == null)	{
			throw new IllegalArgumentException("ShoppingCartListModel cannot be null!!!");
		}
		
		List<ShoppingCartModel> scmList = scl.getScmList();
		
		for (ShoppingCartModel scm : scmList) {
			Product product = this.productDAO.findProductByID(scm.getProduct().getProductId());
			ShoppingCart sc = ShoppingCartHelper.mapShoppingCartModelToShoppingCart(scm, appUser, product);
			this.shoppingCartDAO.addShoppingCart(sc);
		}
		
	}

	@Override
	@Transactional
	public List<ShoppingCartListModel> getAllSCForCustomer(Integer customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<ShoppingCartListModel> getAllSCForCustomer(
			CustomerModel cusModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void addShoppingCart(ShoppingCartListModel scl) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void udpateShoppingCart(ShoppingCartListModel scl,
			ShoppingCartModel scm) {

		if (scm.getQuantity() == 0) {
			removeShoppingCart(scl, scm);
		} else {
			ShoppingCartModel changeScm = findShoppingCartModel(scl, scm);
			changeScm.setQuantity(scm.getQuantity());
		}

	}

	private ShoppingCartModel findShoppingCartModel(ShoppingCartListModel scl,
			ShoppingCartModel scm) {
		ShoppingCartModel changeScm = null;
		List<ShoppingCartModel> scmList = scl.getScmList();
		for (ShoppingCartModel shoppingCartModel : scmList) {
			if (shoppingCartModel.getProduct().getProductId()
					.compareTo(scm.getProduct().getProductId()) == 0) {
				changeScm = shoppingCartModel;
			}
		}
		return changeScm;
	}

	@Override
	@Transactional
	public void removeShoppingCart(ShoppingCartListModel scl,
			ShoppingCartModel scm) {
		ShoppingCartModel changeScm = null;
		List<ShoppingCartModel> scmList = scl.getScmList();
		for (ShoppingCartModel shoppingCartModel : scmList) {
			if (shoppingCartModel.getProduct().getProductId()
					.compareTo(scm.getProduct().getProductId()) == 0) {
				changeScm = shoppingCartModel;
			}
		}
		scmList.remove(changeScm);
	}

	public AppUserDAO getAppUserDAO() {
		return appUserDAO;
	}

	public void setAppUserDAO(AppUserDAO appUserDAO) {
		this.appUserDAO = appUserDAO;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}


}
