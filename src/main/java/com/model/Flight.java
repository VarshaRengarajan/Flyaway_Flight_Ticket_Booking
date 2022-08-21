package com.model;

public class Flight {

	String airline_name;
	String price;
	String flight_no;
	String source_city;
	String destination_city;
	String departure_time;
	String arrival_time;
	String date_of_travel;
	String total_seats;
	String booked_seats;
	String seat_availability;
	String class_type;
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}
	public String getSource_city() {
		return source_city;
	}
	public void setSource_city(String source_city) {
		this.source_city = source_city;
	}
	public String getDestination_city() {
		return destination_city;
	}
	public void setDestination_city(String destination_city) {
		this.destination_city = destination_city;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDate_of_travel() {
		return date_of_travel;
	}
	public void setDate_of_travel(String date_of_travel) {
		this.date_of_travel = date_of_travel;
	}
	public String getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(String total_seats) {
		this.total_seats = total_seats;
	}
	public String getBooked_seats() {
		return booked_seats;
	}
	public void setBooked_seats(String booked_seats) {
		this.booked_seats = booked_seats;
	}
	public String getSeat_availability() {
		return seat_availability;
	}
	public void setSeat_availability(String seat_availability) {
		this.seat_availability = seat_availability;
	}
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
	
	@Override
	public String toString() {
		return "Flight [airline_name=" + airline_name 
				+ ", price=" + price 
				+ ", flight_no=" + flight_no 
				+ ", source_city=" + source_city 
				+ ", destination_city=" + destination_city 
				+ ", departure_time=" + departure_time 
				+ ", arrival_time=" + arrival_time
				+ ", date_of_travel=" + date_of_travel
				+ ", total_seats=" + total_seats
				+ ", booked_seats=" + booked_seats
				+ ", seat_availability=" + seat_availability
				+ ", class_type=" + class_type
				+ "]";
	}
	
	
}
