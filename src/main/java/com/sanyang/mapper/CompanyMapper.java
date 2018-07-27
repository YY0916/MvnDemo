package com.sanyang.mapper;

import java.util.List;

import com.sanyang.pojo.DeveloperCompany;

public interface CompanyMapper {

	List<DeveloperCompany> getCompanys();
	
	void addCompany(DeveloperCompany developerCompany);
}
