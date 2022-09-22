/*
Program: print dublicate entries, sort the array and then remove the dublicate
@author : Subhadip Das
@date : 22.09.22


*/

import java.util.Scanner;  // importing scanner class
import java.util.Arrays;	//importing array class


// declaring class

class DublicateArray

{
	// calling a static method

	static void inputArray()
	{
		Scanner sc= new Scanner(System.in); // creating a scanner object
		System.out.println("Enter the elements:"); //printing
		int row= sc.nextInt(); // taking input
		
		
		int arr[]= new int[row];   // creating a array
		
		System.out.println("Enter the elements:");
		
		
		for(int i=0;i<row;i++)
		{
				
	     	arr[i]= sc.nextInt();
			
			
		}
		
        Arrays.sort(arr); // sort the elements	of array	

		System.out.println();
		
		System.out.println("Array elements is :");
         displayArray(arr);
		
		System.out.println();
		
		System.out.println("Remove Duplicate elements:");
        removeDuplicate(arr);
		
		
		
		
	}// end method
	
	// calling method
	static void displayArray(int myArray[])
	{
		
	   System.out.println();
	
		for(int myrow:myArray)
		{
		 System.out.print(myrow+ "  ");
					
		}
		
	}// ending method
	
   // calling method
   static void removeDuplicate(int myArray[])
   {
	   int size= myArray.length;
	   int new_size;
	   if(size==0||size==1)
		   new_size=size;
	   
	   int temp[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(myArray[i]!=myArray[i+1])
		   {
			   temp[j++]=myArray[i];
		   }
	   }
	   temp[j++]=myArray[size-1];
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   myArray[i]= temp[i];
	   }
	   
	   
	   //printing after removing duplicate entries
	   
	   for(int i=0;i<j;i++)
	   {
		   System.out.print(myArray[i]+"  ");
	   }
   }
// calling a main method
   public static void main(String ...args)
  {

     inputArray();

  }


}   // end main method