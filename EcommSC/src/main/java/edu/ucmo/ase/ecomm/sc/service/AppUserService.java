package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.LoginModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;

public interface AppUserService {
	
	public void addAppUser(AppUser appUser);
	public void updateAppUser(AppUser appUser);
	public List<CustomerModel> listAppUser();
	public CustomerModel getAppUserById(int id);
	public void removeAppUser(int id);
	public boolean validateAppUserLogin(SessionModel sessionModel,
			LoginModel loginModel);

}
