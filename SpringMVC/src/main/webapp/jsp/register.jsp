<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<div align="center">
  <h1>Register</h1>
  <form:form action="checkRegister" method="POST" modelAttribute="user">
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
        <td>Repassword:</td>
        <td><input type="password" name="rePassword" id="rePassword"></td>
      </tr>
      <tr>
        <td></td>
        <td><button>Register</button></td>
      </tr>
    </table>
  </form:form>
</div>
</body>
</html>