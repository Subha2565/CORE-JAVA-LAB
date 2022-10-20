package com.EmployeeManagement;

import java.util.Scanner;

import com.EmployeeManagementImpl.EmployeeImpl;
import com.EmployeeManagementdao.EmployeeDao;
import com.EmployeeManagementmodel.Employee;


// DECLARING A CLASS 
public class App 
{
	// DECLARING MENU PRINTING METHOD
    	public static void menu() {
    		System.out.println("------------------------ MENU ----------------------");
    		System.out.println("1. Add Employee");
    		System.out.println("2. Delete Employee");
    		System.out.println("3. Display All Employees");
    		System.out.println("4. Search Employee");
    		System.out.println("5. Exit");
    }// END OF THE MENU METHOD
    	
    	// DECLARING MAIN METHOD
    	 public static void main( String[] args )
    	    {
    		 
    		 // CREATING SCANNER OBJECT
    		 Scanner sc = new Scanner(System.in);
    		 
    	    	//CREATEING OBJECT OF IMPL
    	    	EmployeeDao em = new EmployeeImpl();
    	    	
    	    	// USE TRY-CATCH
    	    	try {
    	    		
    	    	//DECLARING VARIABLE CHOICE	
    	    	int ch=0;
    	    	
    	    	do {
    	    		menu(); //CALLING MENU METHOD
    	    		
    	    		System.out.println("choose your choice-------->"); // PRINTING
    	    		
    	    		ch= sc.nextInt();  // TAKING INPUT FROM USER
    	    		
    	    		// DECLARING A SWITCH CASE
    	    		switch(ch) {
    	    			case 1:
    	    					em.addEmployee();
    	    					System.out.println(" inserted ");   // PRINTING
    	    					break;
    	    			case 2:
    	    					System.out.println("to delete id");    // PRINTING
    	    					int id = sc.nextInt();  //TAKING INPUT FROM USER
    	    					boolean flag = em.deleteEmployee(id);
    	    						if (flag)
    	    							System.out.println("Id deleted");   // PRINTING
    	    						else System.out.println("not found");   // PRINTING
    	    						break;
    	    			case 3:
    	    					em.displayEmployeeList();  // CALLING A DISPLAY METHOD
    	    			case 4:
    	    				// CREATING A EMPLOYEE OBJECT
    	    					Employee ee = null;
    	    					System.out.println("Enter the Id to be searched:"); // PRINTING
    	    
    	    					id = sc.nextInt(); // TAKING INPUT FROM USER
    	    					ee = em.searchEmployee(id);
    	    						if (ee == null)
    	    							System.out.println("Id not found.......");  // PRINTING
    	    						else
    	    							System.out.println(
    	    										"Employee Id :" + ee.getId() + "Employee Name:" + ee.getName() + " Employee Salary:" + ee.getSalary()); // PRINTING
    	    						break;
    	    			
    	    			
    	    			case 5:
    	    					System.exit(0);
    	    					break;
    	    			default:
    	    					System.out.println("wrong input");  // PRINTING
    	    			
    	    			}
    	    	}while(ch!='5');
    	    	
    	    	// END OF DO-WHILE
    	    	
    	    	sc.close();			// CLOSING SC OBJECT
    	    } catch (Exception e) {
    			System.out.println(e);  // PRINTING
    			
    	    } // CLOSEING CATCH
    	    	
    	}// END OF THE MAIN METHOD
    	 
}// END OF THE CLASS
    	    
    	    

    	    
