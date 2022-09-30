package com.Piggy;

public class Piggy {

	public int intialAmount = 50;
	// static int bal;
	public int addAmount;
	public int totalAmount;

	public Piggy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piggy(int intialAmount, int addAmount, int totalAmount) {
		super();
		this.intialAmount = intialAmount;
		this.addAmount = addAmount;
		this.totalAmount = totalAmount;
	}

	public Piggy(int addAmount, int totalAmount) {
		super();
		this.addAmount = addAmount;
		this.totalAmount = totalAmount;
	}

	public int getIntialAmount() {
		return intialAmount;
	}

	public void setIntialAmount(int intialAmount) {
		this.intialAmount = intialAmount;
	}

	public int getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(int addAmount) {
		this.addAmount = addAmount;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Piggy [intialAmount=" + intialAmount + ", addAmount=" + addAmount + ", totalAmount=" + totalAmount
				+ "]";
	}

}
