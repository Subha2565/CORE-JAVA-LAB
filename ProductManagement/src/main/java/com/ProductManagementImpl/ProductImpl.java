package com.ProductManagementImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.ProductManagementdao.ProductDao;
import com.ProductManagementmodel.Product;

public  class ProductImpl implements ProductDao {
	
	List<Product> productList = new ArrayList<>(); // CREATING A ARRAY OF Product
	

	// CREATING A SCANNER OBJECT
	Scanner sc = new Scanner(System.in);
	
	//CALLING ADD METHOD
	
	
	
	public void addProduct() {
		// TODO Auto-generated method stub
			
			// CREATING A EMPLOYEE OBJECT
			Product p1= new Product();
			
			// TODO Auto-generated method stub
			System.out.println("Enter the id:"); // PRINTING
			p1.setPrdctId(sc.nextInt());// TAKING INPUT FROM USER
			
			System.out.println("Enter the name:");  // PRINTING
			p1.setItemName(sc.next());// TAKING INPUT FROM USER
			
			System.out.println("Enter the Salary:");  // PRINTING
			p1.setBrandName(sc.next());// TAKING INPUT FROM USER
			
			productList.add(p1); // ADDING IN ARRAY
			System.out.println(productList); // PRINTING
			
		}//  END OF THE ADD METHOD
		


	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
	boolean status = false;
		
		//  CREATING A EMPLOYEE OBJECT
		Product pdelete = null;
		for(Product e1: productList)    // TREVERSING ARRAY
		{
			if(e1.getPrdctId()==id)
				pdelete= e1;
		}
		
		if(pdelete == null)
			status = false;
		else {
			productList.remove(pdelete);
			status = true;
		}
		
		return status;
		
	}

	public void displayProductList() {
		// TODO Auto-generated method stub

		
		for (Product p1 : productList) { // TREVERSING ARRAY
			System.out.println(p1);  // PRINTING
			
		} // END OF THE FORLOOP
	}
	

}
