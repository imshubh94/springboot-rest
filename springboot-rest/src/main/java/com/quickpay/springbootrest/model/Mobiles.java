package com.quickpay.springbootrest.model;

//import javax.persistence.Id;

public class Mobiles {

	public Mobiles(int id, String company, String model, double price) {
		super();
		this.Id = id;
		Company = company;
		Model = model;
		Price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

//	@Id
	private int Id;
	private String Company;
	private String Model;
	private double Price;
}