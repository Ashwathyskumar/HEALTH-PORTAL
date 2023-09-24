package com.portal.healthportal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prescription_medications")
public class Pres_req {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int medication_id;
	private int prescription_id;
	private String medication_name;
	private String dosage;
	private String frequency;
	public Pres_req(int medication_id, int prescription_id, String medication_name, String dosage, String frequency) {
		super();
		this.medication_id = medication_id;
		this.prescription_id = prescription_id;
		this.medication_name = medication_name;
		this.dosage = dosage;
		this.frequency = frequency;
	}
	public Pres_req() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMedication_id() {
		return medication_id;
	}
	public void setMedication_id(int medication_id) {
		this.medication_id = medication_id;
	}
	public int getPrescription_id() {
		return prescription_id;
	}
	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}
	public String getMedication_name() {
		return medication_name;
	}
	public void setMedication_name(String medication_name) {
		this.medication_name = medication_name;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	
}
