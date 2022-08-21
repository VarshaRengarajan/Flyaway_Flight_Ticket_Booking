<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    v
    <%@include file="fly.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="adminlogin" method="post">
  AdminUsername: <input name="Username" id="name" maxlength=40><br>
  Password <input type="password" name="Password" maxlength="10"><br>
  <button>Submit</button>
  <a href="changepass.jsp">Change password</a>
</form>
</center>
</body>
</html>