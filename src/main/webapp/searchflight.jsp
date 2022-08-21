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
<form action="flightdetails" method="post">
  <b>Please select your date of travel:</b><br>
  
  Date of travel: <select name="date">
 <option>2022-07-10</option>
 <option>2022-08-1</option> 
 <option>2022-08-2</option>
 <option>2022-08-3</option>
 <option>2022-08-4</option> 
 </select></br><br>

  <b>Please provide journey details:</b><br>
  Source city: <input name="source" maxlength="10"><br>
  Destination city: <input name="destination" maxlength="10"><br>
  Number of tickets: <input name="num_tickets"><br>
  <button>Submit</button>
</form>
</body>
</html>