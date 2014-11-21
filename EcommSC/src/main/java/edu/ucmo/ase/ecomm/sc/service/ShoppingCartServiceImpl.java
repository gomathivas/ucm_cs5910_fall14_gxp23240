package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.ShoppingCartDAO;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.HeaderModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	private static final Logger logger = LoggerFactory
			.getLogger(ShoppingCartServiceImpl.class);
	private ShoppingCartDAO shoppingCartDAO;

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

	public ShoppingCartDAO getShoppingCartDAO() {
		return shoppingCartDAO;
	}

	public void setShoppingCartDAO(ShoppingCartDAO shoppingCartDAO) {
		this.shoppingCartDAO = shoppingCartDAO;
	}

	@Override
	@Transactional
	public void saveShoppingCart(ShoppingCartListModel scl, HeaderModel hm) {
		// TODO Auto-generated method stub
		
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


}
