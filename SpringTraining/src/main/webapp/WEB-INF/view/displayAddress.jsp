<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
</head>
<body>
<br>
<div class = "col-md-8">
	<table class = "table table-bordered" align="center" >
	<thead class = "table-inverse">
		<tr>
			<th>Id</th>
			<th>Line-1</th>
			<th>Line-2</th>
			<th>Zipcode</th>
		</tr>
		</thead>
		<c:forEach items='<%=request.getAttribute("list")%>' var="add">
			<tr>
				<td scope = "row">${add.addressId}</td>
				<td>${add.line1}</td>
				<td>${add.line2}</td>
				<td>${add.zipcode}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>