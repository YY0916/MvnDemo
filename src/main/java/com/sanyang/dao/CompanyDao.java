package com.sanyang.dao;

import java.util.List;

import com.sanyang.pojo.DeveloperCompany;

public interface CompanyDao {
	
	List<DeveloperCompany> getCompanys();
	
	void addCompany(DeveloperCompany developerCompany);
}
