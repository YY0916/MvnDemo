<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" border="1" width="600px">
	<tr>
		<td>开发商名</td>
		<td>公司地址</td>
		<td>法人代表</td>
		<td>公司电话</td>
		<td>创建时间</td>
	</tr>
	<c:forEach items="${companies }" var="company">
	<tr>
		<td>${company.companyName }</td>
		<td>${company.companyAddress }</td>
		<td>${company.corporation }</td>
		<td>${company.companyTel }</td>
		<td>${company.createdDate }</td>
	</tr>
	<tr>
		<td colspan="5">
			<table border="1"  width="590px" >
				<tr>
					<td>工程名称</td>
					<td>工程地址</td>
					<td>开始时间</td>
					<td>结束时间</td>
					<td>项目负责人</td>
					<td>验收标志</td>
					<td>操作</td>
				</tr>
				<c:forEach items="${company.projects }"  var="project">
				<tr>
					<td>${project.proName }</td>
					<td>${project.proAddress }</td>
					<td>${project.beginDate }</td>
					<td>${project.endDate }</td>
					<td>${project.principal }</td>
					<td>
						<c:if test="${project.isCheck =='Y'}">验收通过</c:if>
						<c:if test="${project.isCheck =='N'}">等待验收</c:if>
					</td>
					<td><a href="#">修改</a></td>
				</tr>
				</c:forEach>
			</table>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>