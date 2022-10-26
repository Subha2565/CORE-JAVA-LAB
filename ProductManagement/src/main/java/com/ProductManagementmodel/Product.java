package com.ProductManagementmodel;

public class Product {

	public int prdctId;
	public String itemName;
	public String brandName;
	public int Quantity;
	public int price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int prdctId, String itemName, String brandName, int quantity, int price) {
		super();
		this.prdctId = prdctId;
		this.itemName = itemName;
		this.brandName = brandName;
		Quantity = quantity;
		this.price = price;
	}

	public int getPrdctId() {
		return prdctId;
	}

	public void setPrdctId(int prdctId) {
		this.prdctId = prdctId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prdctId=" + prdctId + ", itemName=" + itemName + ", brandName=" + brandName + ", Quantity="
				+ Quantity + ", price=" + price + "]";
	}
	
	
}
