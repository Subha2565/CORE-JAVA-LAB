/*
Program:Printing Tagline of five companies
@author: SUBHADIP DAS
@Date: 15th sep 2022
*/

//declaring a class
class TaglineOfCompanies
{
	//calling main method
	
  public static void main(String[] args)
  {
	
	String companies =args[0].toLowerCase(); // taking from user
     		 
	switch(companies)
	
	{
	   case "puma" -> System.out.println("FOREVER FASTER IS ALWAYS FIRST,NEVER SECOND NEVER THIRD");    //printing
	   case "adidas" -> System.out.println("IMPOSSIBLE IS NOTHING");      //printing
	   case "wipro"->System.out.println("APPLYING THOUGHT");	//printing	
	    case "tcs"->System.out.println("BUILDING ON BELIEF");		//printing
		 case "reebok"->System.out.println("BE MORE HUMAN");		//printing
	   default -> System.out.println("NOT A COMPANY NAME");             //printing
	         
							        		
	}
	// end of switch
		 
  }
 // end of main method

}
// end of class TaglineOfCompanies