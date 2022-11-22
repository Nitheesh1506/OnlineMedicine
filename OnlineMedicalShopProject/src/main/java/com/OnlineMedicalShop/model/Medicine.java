package com.OnlineMedicalShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.ToString;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="medicine")
@ToString
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   	public int medicineId;
    

    @NotEmpty(message="name is mandatory")
   	public String medicineName;
    
    
   	public float medicinePrice;
   	
    @NotEmpty(message="medicineDescription is mandatory")
   	public String medicineDescription;
	
    
   	public String instock; //Instock
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public float getMedicinePrice() {
		return medicinePrice;
	}
	public void setMedicinePrice(float medicinePrice) {
		this.medicinePrice = medicinePrice;
	}
	public String getMedicineDescription() {
		return medicineDescription;
	}
	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}
	public String getInstock() {
		return instock;
	}
	public void setInstock(String medicineAvailability) {
		this.instock = medicineAvailability;
	}
   	


    
}
