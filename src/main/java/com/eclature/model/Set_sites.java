package com.eclature.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Set_sites {

	@Id
	private int siteId;
	private String siteName;
	private String orgId;
	private String isActive;

	public Set_sites() {
	}

	public Set_sites(int siteId, String siteName, String orgId, String isActive) {
		this.siteId = siteId;
		this.siteName = siteName;
		this.orgId = orgId;
		this.isActive = isActive;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Set_sites [siteId=" + siteId + ", siteName=" + siteName + ", orgId=" + orgId + ", isActive=" + isActive
				+ "]";
	}

}
