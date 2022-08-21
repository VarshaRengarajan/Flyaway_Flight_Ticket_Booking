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
<form action="adminlogin" method="post">
  Username: <input name="Username" maxlength=40><br>
  Password <input type="password" name="Password" maxlength="10"><br>
  <button>Submit</button>
</form>
</body>
</html>