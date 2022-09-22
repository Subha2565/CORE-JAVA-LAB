/*
Program: creat a bank and display the people with balance less than 1000

@author: SUBHADIP DAS
@Date: 21 sept 2022
*/

//declaring a class BankDetailsount

class BankDetails
{
	//declaring instance variable
	
	private int BankDetailsID;
	private String BankDetailsName;
	private double balance;
	
	//default constructor no arg constructor
    BankDetails()
	{
		
	}
	
	//parameterized constructor
	BankDetails(int BankDetailsID,String BankDetailsName,double balance)
	{
		this.BankDetailsID=BankDetailsID;
		this.BankDetailsName=BankDetailsName;
		this.balance=balance;
		
	}
	
	
	public int getBankDetailsID()
	{
		return this.BankDetailsID;
	}
	
	public void setBankDetailsID(int BankDetailsID)
	{
		this.BankDetailsID=BankDetailsID;
	}

	
	public String getBankDetailsName()
	{
		return this.BankDetailsName;
	}
	
	public void setBankDetailsName(String BankDetailsName)
	{
		this.BankDetailsName=BankDetailsName;
	}
	
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
}
