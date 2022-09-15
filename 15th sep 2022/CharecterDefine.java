/*
Program:Printing whether the character entered is vowel ,consonant ,number and special character.
@author: SUBHADIP DAS
@Date: 15th sep 2022
*/
//declaring a class
class CharecterDefine
{
	// declaring method charCheker
	static void charCheker(char charValue)
	{
		int ascValue= charValue; // computing ascii value
		// nested if
		if((ascValue>=65)&&(ascValue<=90))
		{
			System.out.println(" it is a capital latter"); // printing
			if((charValue=='A')||(charValue=='E')||(charValue=='I')||(charValue=='O')||(charValue=='U'))// giving condition for vowel (capital)
			{
				System.out.println("Its a Vowel");// printing
			}
				else    // danling else
				{
					System.out.println("Its a consonant");// printing
				}
		}
			else if((ascValue>=97)&&(ascValue<=122))
			{
				System.out.println(" it is a small latter");// printing
				if((charValue=='a')||(charValue=='e')||(charValue=='i')||(charValue=='o')||(charValue=='u'))// giving condition for vowel (smaller)
				{
					System.out.println(" Its a Vowel ");// printing
				}
					else  // danling else
					{
						System.out.println(" Its a consonant ");// printing
					}
			}
			else if((ascValue>=46)&&(ascValue<=57))
			{
				System.out.println(" it is a number");// printing
			}
		else 	// danling else
		{
			System.out.println(" it is a special charecter ");// printing
		}
	}// end of method charCheker
 // declaring main method
   public static void main(String args[])
   {
	   char value = args[0].charAt(0);// taking a character input
	  charCheker(value); // calling method
   }	// end of main method
}   // end of class