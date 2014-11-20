package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.AppUserDAO;
import edu.ucmo.ase.ecomm.sc.domain.AppRole;
import edu.ucmo.ase.ecomm.sc.domain.AppRoleEnum;
import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.LoginModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;

@Service
public class AppUserServiceImpl implements AppUserService {

	private AppUserDAO appUserDAO;

	public AppUserDAO getAppUserDAO() {
		return appUserDAO;
	}

	public void setAppUserDAO(AppUserDAO appUserDAO) {
		this.appUserDAO = appUserDAO;
	}

	@Override
	@Transactional
	public void addAppUser(AppUser appUser) {
		// TODO Auto-generated method stub

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
			throw new IllegalArgumentException(
					"Login model cannot be null ! ");
		}

		AppUser appUser = this.appUserDAO.getAppUserByUserName(loginModel
				.getUserName());

		if (appUser == null) {
			return false;
		}

		Set<AppRole> appRoles = appUser.getAppRoles();

		if (appRoles.size() == 1) {
			for (AppRole appRole : appRoles) {
				if(appRole.getAppRoleCode().compareTo(AppRoleEnum.ADMIN.getRoleCode() ) ==0)	{
					sessionModel.setAppRole(AppRoleEnum.ADMIN);
				}
				else if (appRole.getAppRoleCode().compareTo(AppRoleEnum.CUSTOMER.getRoleCode() ) ==0)	{
					sessionModel.setAppRole(AppRoleEnum.CUSTOMER);
				}
			}
		}

		if (appUser.getPassword().compareTo(loginModel.getPassword()) == 0) {
			return true;
		}

		return false;
	}

}
