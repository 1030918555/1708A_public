package com.hq.bean;

public class Error_record {
	private Integer id;
	private String price;
	private String name;
	private String place;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Error_record(Integer id, String price, String name, String place, String phone) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.place = place;
		this.phone = phone;
	}
	public Error_record() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Error_record [id=" + id + ", price=" + price + ", name=" + name + ", place=" + place + ", phone="
				+ phone + "]";
	}
	public Error_record(String name,String price,  String place, String phone) {
		super();
		this.price = price;
		this.name = name;
		this.place = place;
		this.phone = phone;
	}
	
	

}
