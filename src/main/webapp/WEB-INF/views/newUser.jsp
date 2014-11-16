<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>New User</h1>
	<form:form action="add" method="post">
		<c:if test=""></c:if>
		<p>
			Enter e-mail:
			<form:input path="email" size="20" />
		</p>
		<p>
			Re enter e-mail:
			<form:input path="reenteredEmail" size="20" />
		</p>
		<p>
			Choose an user name:
			<form:input path="name" size="20" />
		</p>
		<p>
			Password:
			<form:input path="password" size="20" />
		</p>
		<p>
			Re-enter password:
			<form:input path="reenteredPassword" size="20" />
		</p>
		<button type="submit">Submit</button>
	</form:form>
</body>
</html>
