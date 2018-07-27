package com.sanyang.pojo;

import java.util.List;

public class DeveloperCompany {

	private Integer did; 
	private String companyName;
	private String companyAddress;
	private String corporation;
	private String companyTel;
	private String createdDate;
	private List<Project> projects;
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCorporation() {
		return corporation;
	}
	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}
	public String getCompanyTel() {
		return companyTel;
	}
	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "DeveloperCompany [did=" + did + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", corporation=" + corporation + ", companyTel=" + companyTel + ", createdDate=" + createdDate
				+ ", projects=" + projects + "]";
	}
	 
	 
}
