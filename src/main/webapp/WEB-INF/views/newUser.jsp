<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>New User</h1>
	<form action="../add">
		<p>
			Enter e-mail: <input type="text" id="email" size="20" />
		</p>
		<p>
			Re enter e-mail: <input type="text" id="renterEmail" size="20" />
		</p>
		<p>
			Choose an user name: <input type="text" id="name" size="20" />
		</p>
		<p>
			Password: <input type="password" id="email" size="20" />
		</p>
		<p>
			Re-enter password: <input type="password" id="email" size="20" />
		</p>
	</form>
</body>
</html>
