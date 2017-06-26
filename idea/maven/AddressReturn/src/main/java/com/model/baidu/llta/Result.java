package com.model.baidu.llta;

public class Result {
	private location location;
	private String formatted_address;
	private String business;
	private addressComponent addressComponent;
	private String cityCode;
	public location getLocation() {
		return location;
	}
	public void setLocation(location location) {
		this.location = location;
	}
	public String getFormatted_address() {
		return formatted_address;
	}
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public addressComponent getAddressComponent() {
		return addressComponent;
	}
	public void setAddressComponent(addressComponent addressComponent) {
		this.addressComponent = addressComponent;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	
}
