package com.sanyang.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.mapper.ProjectMapper;
import com.sanyang.pojo.Project;

@Repository("projectDao")
public class ProjectDaoImp implements ProjectDao {
	
	@Autowired
	private ProjectMapper projectMapper;
	
	@Override
	public void addProject(Project project) {
		System.out.println(project);
		projectMapper.addProject(project);
	}

}
