package com.sanyang.pojo;

public class Project {

	 private Integer pid;// int(11) NOT NULL AUTO_INCREMENT,
	 private Integer dtid;// int(11) DEFAULT NULL,
	 private String proName;// varchar(10) DEFAULT NULL,
	 private String proAddress;//` varchar(20) DEFAULT NULL,
	 private String beginDate;//` date DEFAULT NULL,
	 private String endDate;//` date DEFAULT NULL,
	 private String principal;//` varchar(20) DEFAULT NULL,
	 private String isCheck;//` varchar(1) DEFAULT NULL,
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getDtid() {
		return dtid;
	}
	public void setDtid(Integer dtid) {
		this.dtid = dtid;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", dtid=" + dtid + ", proName=" + proName + ", proAddress=" + proAddress
				+ ", beginDate=" + beginDate + ", endDate=" + endDate + ", principal=" + principal + ", isCheck="
				+ isCheck + "]";
	}
	 
}
