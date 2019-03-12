<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script type="text/javascript">
	var url_string = window.location.href;
	var url = new URL(url_string);
	var c = url.searchParams.get("message");
	if(c == "error"){
		alert("Login fail!");
	}
</script>
</head>
<body>
	<div align="center">
		<h1>Login</h1>
		<form:form action="home" method="POST" modelAttribute="user">
			<table>
				<tr>
					<td>Username:</td>
					<td><input name="username" type="text"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input name="password" type="password"></td>
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