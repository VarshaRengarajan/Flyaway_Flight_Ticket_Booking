<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="fly.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="adminpasswordupdate" method="post">
  Enter username: <input name="username" maxlength=40><br>
  Enter old password: <input name="password" maxlength=40><br>
  Enter new password: <input type="password" name="new_password" maxlength="10"><br>
  Enter new password again: <input type="password" name="new_password" maxlength="10"><br>
  <button>Submit</button>
  
</form>
</body>
</html>