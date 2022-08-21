<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.ArrayList" %>
<%@page import="com.model.Flight" %>
<%@include file="fly.jsp" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bookflight" method="post">
<b>Please select your flight:</b><br>
<table border ="1" style="width:80%">
         <tr>
          <th><b>Flight no</b></th>
          <th><b>Airline Name</b></th>
          <th><b>Price</b></th>
          <th><b>Source city</b></th>
          <th><b>Destination city</b></th>
          <th><b>Departure time</b></th>
          <th><b>Arrival time</b></th>
          <th><b>total seats</b></th>
          <th><b>booked seats</b></th>
          <th><b>seat availability</b></th>
          <th><b>date</b></th>
          <th><b>class</b></th>
         </tr>
        
        <%ArrayList<Flight> flight = 
        (ArrayList<Flight>)request.getAttribute("flight_details");
        for(Flight f:flight){%>
        
            <tr>
                <td><button><%=f.getFlight_no()%></button></td>
                <input type = "hidden" name = "flight_no" value = <%=f.getFlight_no()%>>
                <td><%=f.getAirline_name()%></td>
                <td><%=f.getPrice()%></td>
                <td><%=f.getSource_city()%></td>
                <td><%=f.getDestination_city()%></td>
                <td><%=f.getDeparture_time()%></td>
                <td><%=f.getArrival_time()%></td>
                <td><%=f.getTotal_seats()%></td>
                <td><%=f.getBooked_seats()%></td>
                <td><%=f.getSeat_availability()%></td>
                <td><%=f.getDate_of_travel()%></td>
                <td><%=f.getClass_type()%></td>
            </tr>
            <%}%>
        </table> 
        
        
</form>

</body>
</html>