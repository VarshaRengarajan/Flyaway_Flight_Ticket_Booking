<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="fly.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerdetails" method="post">
<b>Please enter your details:</b><br>
FullName: <input name="full_name" maxlength=40><br>
Address:<input name="address"  maxlength="40"><br>
Mobile No.: <input name="mobile"  maxlength=40><br>
Age: <input name="age"><br>
Email Id: <input name="email_id"  maxlength=40><br>
Country: <input name="country"  maxlength=40><br>
Proof: <select name="proof">
 <option>Aadhar Card</option>
 <option>SSN</option> 
 <option>Passport</option>
 <option>Voter Id</option>
<option>Driving License</option> 
 </select></br>
 
 <button>Submit</button>
</form>
</body>
</html>