package com.sanyang.service;

import java.util.List;

import com.sanyang.pojo.DeveloperCompany;

public interface CompanyService {

	List<DeveloperCompany> getCompanys();
	
	void addCompany(DeveloperCompany developerCompany);
}
