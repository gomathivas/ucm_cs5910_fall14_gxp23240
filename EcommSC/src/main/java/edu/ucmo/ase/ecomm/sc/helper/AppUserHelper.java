package edu.ucmo.ase.ecomm.sc.helper;

import java.util.HashSet;
import java.util.Set;

import edu.ucmo.ase.ecomm.sc.dao.AppUserDAO;
import edu.ucmo.ase.ecomm.sc.domain.Address;
import edu.ucmo.ase.ecomm.sc.domain.AddressType;
import edu.ucmo.ase.ecomm.sc.domain.AppRole;
import edu.ucmo.ase.ecomm.sc.domain.AppRoleEnum;
import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;

public class AppUserHelper {
	
	public static AppUser mapCustomerModelToAppUser(SessionModel sm, AppRoleEnum appRole,
			AppUserDAO appUserDAO)	{
		AppUser appUser = new AppUser();
		CustomerModel cm = sm.getCustomerModel();
		
		appUser.setFirstName(cm.getFirstName());
		appUser.setMiddleName(cm.getMiddleName());
		appUser.setLastName(cm.getLastName());
		appUser.setUserName(cm.getEmail());
		appUser.setGender(cm.getGender());
		appUser.setPassword(cm.getPassword());
		appUser.setEmail(cm.getEmail());
		appUser.setPhNo(cm.getPhNo());
		
		mapCMAddressToAppUser(cm, appUser, appUserDAO);
		mapCMAppRoleToAppUser(cm, appUser, appUserDAO, appRole);
		
		return appUser;
	}

	private static void mapCMAppRoleToAppUser(CustomerModel cm,
			AppUser appUser, AppUserDAO appUserDAO, AppRoleEnum appRole) {
		Set<AppRole> ars = new HashSet<AppRole>();
		AppRole ar = null;
		if(appRole.getRoleCode().compareTo("CUST")==0)	{
			ar = appUserDAO.findAppRoleByCode("CUST");
		}
		else if (appRole.getRoleCode().compareTo("AD")==0)	{
			ar = appUserDAO.findAppRoleByCode("AD");
		}
		
		ars.add(ar);
		appUser.setAppRoles(ars);
	}

	private static void mapCMAddressToAppUser(CustomerModel cm, AppUser appUser,
			AppUserDAO appUserDAO) {
		
		edu.ucmo.ase.ecomm.sc.model.Address address = cm.getAddress();
		Set<Address> addresses = new HashSet<Address>();
		Address add = new Address();
		add.setAddressLineOne(address.getAddressLineOne());
		add.setAddressLineTwo(address.getAddressLineTwo());
		add.setAppUser(appUser);
		add.setCity(address.getCity());
		add.setState(address.getState());
		add.setCountry(address.getCountry());
		add.setZipCode(address.getZipCode());
		
		AddressType addressType = appUserDAO.findAddressTypeByCode("CA");
		add.setAddressType(addressType);
		
		addresses.add(add);
		appUser.setAddresses(addresses);
		
	}

}
