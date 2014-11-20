package edu.ucmo.ase.ecomm.sc.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="APP_ROLE")
public class AppRole {

	@Id
	@Column(name="APP_ROLE_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator= "app_role_Sequence")
	@SequenceGenerator(name = "app_role_Sequence", sequenceName = "app_role_Sequence")
	private Integer appRoleId;
	
	@Column(name="APP_ROLE_CODE")
	private String appRoleCode;
	
	@Column(name="ROLE_SHORT_DESCRIPTION")
	private String roleShortDes;
	
	@Column(name="ROLE_LONG_DESCRIPTION")
	private String roleLongDes;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;
	
	@ManyToMany(mappedBy="appRoles")
    private Set<AppUser> appUsers = new HashSet<AppUser>();

	public Integer getAppRoleId() {
		return appRoleId;
	}

	public void setAppRoleId(Integer appRoleId) {
		this.appRoleId = appRoleId;
	}

	public String getAppRoleCode() {
		return appRoleCode;
	}

	public void setAppRoleCode(String appRoleCode) {
		this.appRoleCode = appRoleCode;
	}

	public String getRoleShortDes() {
		return roleShortDes;
	}

	public void setRoleShortDes(String roleShortDes) {
		this.roleShortDes = roleShortDes;
	}

	public String getRoleLongDes() {
		return roleLongDes;
	}

	public void setRoleLongDes(String roleLongDes) {
		this.roleLongDes = roleLongDes;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Set<AppUser> getAppUsers() {
		return appUsers;
	}

	public void setAppUsers(Set<AppUser> appUsers) {
		this.appUsers = appUsers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppRole [appRoleId=").append(appRoleId)
				.append(", appRoleCode=").append(appRoleCode)
				.append(", roleShortDes=").append(roleShortDes)
				.append(", roleLongDes=").append(roleLongDes)
				.append(", createdBy=").append(createdBy)
				.append(", createdDate=").append(createdDate)
				.append(", modifiedBy=").append(modifiedBy)
				.append(", modifiedDate=").append(modifiedDate)
				.append(", appUsers=").append("]");
		return builder.toString();
	}
	
	
	
}
