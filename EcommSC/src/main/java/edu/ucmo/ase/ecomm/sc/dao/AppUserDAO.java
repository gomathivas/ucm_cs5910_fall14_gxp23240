package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.domain.Address;
import edu.ucmo.ase.ecomm.sc.domain.AddressType;
import edu.ucmo.ase.ecomm.sc.domain.AppRole;
import edu.ucmo.ase.ecomm.sc.domain.AppUser;

public interface AppUserDAO {

	public void addAppUser(AppUser p);
	public void updateAppUser(AppUser p);
	public List<AppUser> listAppUser();
	public AppUser getAppUserById(int id);
	public void removeAppUser(int id);
	public AppUser getAppUserByUserName(String userName);
	public AddressType findAddressTypeByCode(String addressTypeCode);
	public AppRole findAppRoleByCode(String appRoleCode);
	public void addAddress(Address address);
}
