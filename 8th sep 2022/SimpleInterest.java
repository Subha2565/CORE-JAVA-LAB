/*
Program: Calculation of Simple Interest
@author: Subhadip Das
@Date: 8th sep 2022
*/
//decalraing a class
class SimpleInterest
{
	//calling main
	public static void main(String[] args)
	{
	    int time=5; // time is in year
	    int principal=Integer.parseInt(args[0]);
		int rateofinterest=Integer.parseInt(args[1]);
		int simpleinterest=(((Integer.parseInt(args[0]))*(Integer.parseInt(args[1]))*5)/100);
		System.out.println("Simple Interest is : "+simpleinterest);
	}
	//end of main
}
// end of class SimpleInterest
