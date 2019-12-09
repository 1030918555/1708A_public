package com.hq.bean;

public class Book {

	private Integer id;
	private Integer price;
	private String name;
	private String place;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", name=" + name + ", place=" + place + ", phone=" + phone + "]";
	}
	public Book(Integer id, Integer price, String name, String place, String phone) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
		this.place = place;
		this.phone = phone;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Book( String name,Integer price, String place, String phone) {
		super();
		this.price = price;
		this.name = name;
		this.place = place;
		this.phone = phone;
	}
	
}
