class OrgCreation
  {
   public static void main(String ...args)
    
	{
		Student stArray[]= new Student[10];// reference for creating an array of objects ()
	
	
	
			for(int i=0;i<10;i++)
			{
				System.out.println("Creating student :"+(i+1));
				stArray[i]= new Student();// allocation of memory to each student
				stArray[i].createStudent();
			}
	
			for(int i=0;i<10;i++)
			{
				System.out.println("Student Details :"+(i+1));
				stArray[i].displayStudent();
			}	
	
    
	
	}
	
  }