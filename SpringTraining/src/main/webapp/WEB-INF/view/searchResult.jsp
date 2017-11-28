<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri ="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
		<tr>
			<td>AddressId</td>
			<td>Line-1</td>
			<td>Line-2</td>
			<td>Line-3</td>
		</tr>
		<c:forEach items="<%=request.getAttribute(\"list\") %>" var="address">
			<tr><td>${address.addressId}</td>
			<td>${address.line1}</td>
			<td>${address.line2}</td>
			<td>${address.zipcode}</td>
			<td><a href="<%=request.getContextPath()%>/delete.html?id=${reg.id}">Delete</a></td></tr>
		</c:forEach>
	</table>
</body>
</html>