package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.AppUserDAO;
import edu.ucmo.ase.ecomm.sc.domain.Address;
import edu.ucmo.ase.ecomm.sc.domain.AppRole;
import edu.ucmo.ase.ecomm.sc.domain.AppRoleEnum;
import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.domain.ShoppingCart;
import edu.ucmo.ase.ecomm.sc.helper.AppUserHelper;
import edu.ucmo.ase.ecomm.sc.helper.ShoppingCartHelper;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.LoginModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;

@Service
public class AppUserServiceImpl implements AppUserService {

	private static final Logger logger = LoggerFactory
			.getLogger(AppUserServiceImpl.class);

	private AppUserDAO appUserDAO;

	public AppUserDAO getAppUserDAO() {
		return appUserDAO;
	}

	public void setAppUserDAO(AppUserDAO appUserDAO) {
		this.appUserDAO = appUserDAO;
	}

	@Override
	@Transactional
	public void addAppUser(SessionModel sm, AppRoleEnum appRole) {
		AppUser appUser = AppUserHelper.mapCustomerModelToAppUser(sm, appRole,
				appUserDAO);
		this.appUserDAO.addAppUser(appUser);
		Set<Address> addresses = appUser.getAddresses();
		for (Address address : addresses) {
			this.appUserDAO.addAddress(address);
		}
	}

	@Override
	@Transactional
	public void updateAppUser(AppUser appUser) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<CustomerModel> listAppUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public CustomerModel getAppUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void removeAppUser(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public boolean validateAppUserLogin(SessionModel sessionModel,
			LoginModel loginModel) {

		if (loginModel == null) {
			throw new IllegalArgumentException("Login model cannot be null ! ");
		}

		AppUser appUser = this.appUserDAO.getAppUserByUserName(loginModel
				.getUserName());

		if (appUser == null) {
			return false;
		}

//		 logAppUser(appUser);

		Set<AppRole> appRoles = appUser.getAppRoles();

		if (appRoles.size() == 1) {
			for (AppRole appRole : appRoles) {
				if (appRole.getAppRoleCode().compareTo(
						AppRoleEnum.ADMIN.getRoleCode()) == 0) {
					sessionModel.setAppRole(AppRoleEnum.ADMIN);
				} else if (appRole.getAppRoleCode().compareTo(
						AppRoleEnum.CUSTOMER.getRoleCode()) == 0) {
					sessionModel.setAppRole(AppRoleEnum.CUSTOMER);
				}
			}
		}

		if (appUser.getPassword().compareTo(loginModel.getPassword()) == 0) {
			mapReqDomainToModel(appUser, sessionModel);
			return true;
		}

		return false;
	}

	private void mapReqDomainToModel(AppUser appUser, SessionModel sessionModel) {
		ShoppingCartHelper.mapAllShoppingCartToModel(appUser.getShoppingCarts(), sessionModel.getShoppingCartListModel());
	}

	private void logAppUser(AppUser appUser) {

		if (appUser == null) {
			logger.info("appUser is null");
			return;
		}

		Set<AppRole> appRoles = appUser.getAppRoles();

		if (appRoles == null) {
			logger.info("App Role is null");
		}

		else {
			for (AppRole appRole : appRoles) {
				logger.info("app role " + appRole);
			}
		}

		Set<Address> addresses = appUser.getAddresses();

		if (addresses == null) {
			logger.info("addresses are null");

		} else {
			for (Address address : addresses) {
				logger.info("address" + address);

				if (address.getAddressType() == null) {
					logger.info("addresstype is null");
				} else {
					logger.info("address type " + address.getAddressType());
				}
			}
		}
		
		Set<ShoppingCart> scs = appUser.getShoppingCarts();
		
		if(scs == null)	{
			logger.info("shopping cart is null");
		}
		else	{
			for (ShoppingCart sc : scs) {
				logger.info("Shopping cart " + sc);
			}
		}
	}

}
