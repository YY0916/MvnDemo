package com.sanyang.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mapper.CompanyMapper;
import com.sanyang.pojo.DeveloperCompany;

@Repository("companyDao")
public class CompanyDaoImp implements CompanyDao {

	@Autowired
	private CompanyMapper company;
	
	@Override
	public List<DeveloperCompany> getCompanys() {
		// TODO Auto-generated method stub
		 List<DeveloperCompany> companies =company.getCompanys();
		return companies;
	}
	
	@Override
	public void addCompany(DeveloperCompany developerCompany) {
		// TODO Auto-generated method stub
		company.addCompany(developerCompany);
	}

}
