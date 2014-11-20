package edu.ucmo.ase.ecomm.sc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="APP_USER_ROLE")
public class AppUserRole {

	@Id
	@Column(name="APP_USER_ROLE_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "app_user_role_Sequence")
	@SequenceGenerator(name = "app_user_role_Sequence", sequenceName = "app_user_role_Sequence")
	private Integer appUserRoleId;
	
//	@ManyToOne
//	@JoinColumn(name="APP_USER_ID")
//	private AppUser appUser;
//	
//	@ManyToOne
//	@JoinColumn(name="APP_ROLE_ID")
//	private AppRole appRole;

	public Integer getAppUserRoleId() {
		return appUserRoleId;
	}

	public void setAppUserRoleId(Integer appUserRoleId) {
		this.appUserRoleId = appUserRoleId;
	}

//	public AppUser getAppUser() {
//		return appUser;
//	}
//
//	public void setAppUser(AppUser appUser) {
//		this.appUser = appUser;
//	}
//
//	public AppRole getAppRole() {
//		return appRole;
//	}
//
//	public void setAppRole(AppRole appRole) {
//		this.appRole = appRole;
//	}
	
	
}
