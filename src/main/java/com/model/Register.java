package com.model;

public class Register {

	String full_name;
	String address;
	String age;
	String mobile;
	String email_id;
	String proof;
	String country;
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Register [full_name=" + full_name 
				+ ", address=" + address 
				+ ", age=" + age 
				+ ", mobile=" + mobile 
				+ ", email_id=" + email_id 
				+ ", proof=" + proof 
				+ ", country=" + country
				+ "]";
	}
	
}
