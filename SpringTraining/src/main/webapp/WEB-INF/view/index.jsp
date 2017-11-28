<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@taglib uri ="http://www.springframework.org/tags/form" prefix = "f" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<title>Search</title>
</head>
<body>
	<div class="form-group col-md-4">
		<form action="<%=request.getContextPath() %>/addresses" method="get">
			<!-- Zipcode : <input path="zipcode" name="zipcode" class="form-control" placeholder ="zipcode"/> -->

			<label for="inputZip" class="col-form-label">Zipcode :</label> <input
				type="text" class="form-control" id="inputZip" name="zipcode">
			<br>
			<button type="submit" class="btn btn-primary">Search</button>

		</form>
	</div>
</body>
</html>