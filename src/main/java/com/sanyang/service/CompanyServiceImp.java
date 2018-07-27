package com.sanyang.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanyang.dao.CompanyDao;
import com.sanyang.dao.JedisDao;
import com.sanyang.pojo.DeveloperCompany;

@Repository("companyService")
public class CompanyServiceImp implements CompanyService {
	
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private JedisDao jedisDao;

	@Override
	public List<DeveloperCompany> getCompanys() {
		String stringJson = jedisDao.get("companys");
		ObjectMapper objectMapper =new ObjectMapper();
		//从缓存中读取数据
		try {
			if (stringJson!=null&&!"".equals(stringJson)) {
				//把字符串转换成list
				JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, DeveloperCompany.class);
				List<DeveloperCompany> companies  = objectMapper.readValue(stringJson, javaType);
				return companies;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//从数据库中查询数据集
		List<DeveloperCompany> companys=companyDao.getCompanys();
		
		//向缓存中添加内容
		try {
			//把list转换成字符串
			String companies = objectMapper.writeValueAsString(companys);
			jedisDao.set("companys", companies);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return companys;
	}

	@Override
	public void addCompany(DeveloperCompany developerCompany) {
		//从缓存中删除数据
		jedisDao.del("companys");
		
		companyDao.addCompany(developerCompany);
	}

}
