<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="fly.jsp" %>      
    
<%@page import="java.util.ArrayList" %>
<%@page import="com.model.Flight" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Thanks ${full_name} for booking with us..</b><br><br>

<form>
<b>Your ticket details:</b><br><br>
        
        <%ArrayList<Flight> flight = 
        (ArrayList<Flight>)request.getAttribute("customer_flight_details");
        for(Flight f:flight){%>
        
            <b>Name: </b>${full_name}<br>
            <b>Age: </b>${age}<br>
            <b>Mobile: </b>${mobile}<br>
            <b>Proof: </b>${proof}<br>
            <b>Flight no: </b><%=f.getFlight_no()%><br>
            <b>Airline Name: </b><%=f.getAirline_name()%><br>
            <b>Price: </b><%=f.getPrice()%><br>
            <b>Source city: </b><%=f.getSource_city()%><br>
            <b>Destination city: </b><%=f.getDestination_city()%><br>
            <b>Departure time: </b><%=f.getDeparture_time()%><br>
            <b>Arrival time: </b><%=f.getArrival_time()%><br>
            <b>Date: </b><%=f.getDate_of_travel()%><br>
            <b>Class: </b><%=f.getClass_type()%>
            
            <%}%> 
        
</form>

</body>
</html>