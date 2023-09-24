package com.portal.healthportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prescription")
public class medicine {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int prescription_id;
private String medicine1;
private int dosage1;
private String medicine2;
private int dosage2;
private String medicine3;
private int dosage3;
private String medicine4;
private int dosage4;
public medicine(int prescription_id, String medicine1, int dosage1, String medicine2, int dosage2, String medicine3,
		int dosage3, String medicine4, int dosage4) {
	super();
	this.prescription_id = prescription_id;
	this.medicine1 = medicine1;
	this.dosage1 = dosage1;
	this.medicine2 = medicine2;
	this.dosage2 = dosage2;
	this.medicine3 = medicine3;
	this.dosage3 = dosage3;
	this.medicine4 = medicine4;
	this.dosage4 = dosage4;
}
public medicine() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPrescription_id() {
	return prescription_id;
}
public void setPrescription_id(int prescription_id) {
	this.prescription_id = prescription_id;
}
public String getMedicine1() {
	return medicine1;
}
public void setMedicine1(String medicine1) {
	this.medicine1 = medicine1;
}
public int getDosage1() {
	return dosage1;
}
public void setDosage1(int dosage1) {
	this.dosage1 = dosage1;
}
public String getMedicine2() {
	return medicine2;
}
public void setMedicine2(String medicine2) {
	this.medicine2 = medicine2;
}
public int getDosage2() {
	return dosage2;
}
public void setDosage2(int dosage2) {
	this.dosage2 = dosage2;
}
public String getMedicine3() {
	return medicine3;
}
public void setMedicine3(String medicine3) {
	this.medicine3 = medicine3;
}
public int getDosage3() {
	return dosage3;
}
public void setDosage3(int dosage3) {
	this.dosage3 = dosage3;
}
public String getMedicine4() {
	return medicine4;
}
public void setMedicine4(String medicine4) {
	this.medicine4 = medicine4;
}
public int getDosage4() {
	return dosage4;
}
public void setDosage4(int dosage4) {
	this.dosage4 = dosage4;
}

}
