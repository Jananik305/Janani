package com;

public class Pojo {
private String policy_no;
private String cost;
private String expiry_date;
private String admission_date;
private String discharge_date;
private String medical_specialist;
public Pojo(String policy_no,String cost,String expiry_date,String admission_date,String discharge_date,String medical_specialist)
{
	this.policy_no = policy_no;
	this.cost = cost;
	this.expiry_date = expiry_date;
	this.admission_date = admission_date;
	this.discharge_date = discharge_date;
	this.medical_specialist = medical_specialist;
}
public String getPolicy_no() {
	return policy_no;
}
public void setPolicy_no(String policy_no) {
	this.policy_no = policy_no;
}
public String getCost() {
	return cost;
}
public void setCost(String cost) {
	this.cost = cost;
}
public String getExpiry_date() {
	return expiry_date;
}
public void setExpiry_date(String expiry_date) {
	this.expiry_date = expiry_date;
}
public String getAdmission_date() {
	return admission_date;
}
public void setAdmission_date(String admission_date) {
	this.admission_date = admission_date;
}
public String getDischarge_date() {
	return discharge_date;
}
public void setDischarge_date(String discharge_date) {
	this.discharge_date = discharge_date;
}
public String getMedical_specialist() {
	return medical_specialist;
}
public void setMedical_specialist(String medical_specialist) {
	this.medical_specialist = medical_specialist;
}

}