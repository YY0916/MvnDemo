package com.sanyang.handler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sanyang.dao.ProjectDao;
import com.sanyang.pojo.DeveloperCompany;
import com.sanyang.pojo.Project;
import com.sanyang.service.CompanyService;


@Controller
public class CompanyHandler {
	
	@Autowired
	private CompanyService companyService;
	
	@Autowired
	private ProjectDao projectDao;
	
	@RequestMapping("/getCompany")
	public String getCompanys(Map<String, List<DeveloperCompany>> map){
	
		List<DeveloperCompany> companies= companyService.getCompanys();
		map.put("companies", companies);
		return "main";
	}
	
	@RequestMapping("/addCompany")
	public String  addComany(DeveloperCompany developerCompany,Project project){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(new Date());
		developerCompany.setCreatedDate(time);
		companyService.addCompany(developerCompany);
		project.setDtid(developerCompany.getDid());
		projectDao.addProject(project);
		return "redirect:getCompany.jaj";
	}
}
