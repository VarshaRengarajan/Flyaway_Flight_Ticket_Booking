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
<form action="paymentqr.jsp" method="post">
<b>Review your details:</b><br>
        full_name: ${full_name}<br>
        address: ${address}  <br>
        mobile: ${mobile}   <br>
        age: ${age}   <br>
        email_id: ${email_id}   <br>
        country: ${country}   <br>
        proof: ${proof}   
        <br>
        <button>Proceed to payment</button> 
</form>
</body>
</html>