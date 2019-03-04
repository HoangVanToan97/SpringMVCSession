<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h1>Login</h1>
		<form:form action="home" method="POST" modelAttribute="user">
			<table>
				<tr>
					<td>Username:</td>
					<td><input name="username" id="username"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" id="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><button>Login</button></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>