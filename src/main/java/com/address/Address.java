package com.address;

public class Address {
	private String publicPlace;
	private String district;
	private String locality;
	private String fu;
	
	public String getPublicPlace() {
		return this.publicPlace;
	}
	
	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}
	
	public String getDistrict() {
		return this.district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getLocality() {
		return this.locality;
	}
	
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	public String getFu() {
		return this.fu;
	}
	
	public void setFu(String fu) {
		this.fu = fu;
	}
	
	@Override
	public String toString() {
		return "Address{\n" + "Public Place: " + getPublicPlace() + "\nDistrict: " + getDistrict() + "\nLocality: " + getLocality() + "\nfu: " + getFu();
	}
}
