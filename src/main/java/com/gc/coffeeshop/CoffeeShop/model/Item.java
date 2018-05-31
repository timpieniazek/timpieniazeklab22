package com.gc.coffeeshop.CoffeeShop.model;

import java.io.Serializable;

public class Item implements Serializable{
	
	private String itemName;
	private String description;
	private Integer quantity;
	private Float price;
	
	public Item() {
		super();
	}

	public Item(String itemName, String description, Integer quantity, Float price) {
		super();
		this.itemName = itemName;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", description=" + description + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	

}
