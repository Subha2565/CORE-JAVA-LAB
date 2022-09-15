/*
Program:Printing star pattern
@author: SUBHADIP DAS
@Date: 15th sep 2022
*/

import java.util.Scanner; // improting scanner package

//declaring a class

class StarPattern
{
	//declaring method
	static void Pattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++) // outer loop 
		{
			System.out.println(); // for new line
			
			for(int gaps=noOfRows;gaps>i;gaps--) // inner loop
			{
				System.out.print(" "); // printing gaps
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* "); // printing star
			}
			
			
		} // closing outer loop
		
		
	}// end of the method
	
		//calling main method
   public static void main(String[] args)
   {
	  int number;
	  Scanner sc= new Scanner(System.in); // declare scanner object
	  System.out.println("Enter row value:"); // taking value from user
	  number= sc.nextInt();// taking value from user
	  Pattern(number); // calling method
      
   }// end of the main method


}// end of the class StarPattern
