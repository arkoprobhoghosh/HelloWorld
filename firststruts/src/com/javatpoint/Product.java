package com.javatpoint;  
  
public class Product {
	
	private int id;
	private String name;
	private float price;
	private String lname;
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
	    return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {
	    this.name = name;
	}
	
	public float getPrice() {
	    return price;
	}
	public void setPrice(float price) {
	    this.price = price;
	}
	  
	public String execute() {
	    return "success";
	}

}