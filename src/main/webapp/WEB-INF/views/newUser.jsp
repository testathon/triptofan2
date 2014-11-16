<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>New User</h1>
	<form:form action="add" method="post" role="form">

	
		<c:if test=""></c:if>
		<div class="form-group">
			<label for="emailAddress">Email address: </label>
			<form:input path="email" size="20" id="emailAddress"
				cssClass="form-control" />
		</div>
		<div class="form-group">
			<label for="reenteredEmail">Re-enter email: </label>
			<form:input path="reenteredEmail" size="20" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<label for="name">Choose an user name: </label>
			<form:input path="name" size="20" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<label for="password">Password:</label>
			<form:input path="password" size="20" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<label for="reenteredPassword">Re-enter password:</label>
			<form:input path="reenteredPassword" size="20" cssClass="form-control"/>
		</div>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>
