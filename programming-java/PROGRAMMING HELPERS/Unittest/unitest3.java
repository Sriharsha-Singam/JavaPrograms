import java.util.*;
public class unitest3

{
    public static void main(String args[]) 
    { 
	try
	{
	 System.out.println("Please enter names of 5 students!!");
	
		String students[] =new String[5];
		  for(int i=0;i<=4;i++)
        {
           Scanner sc1=new Scanner (System.in);
            students[i]=sc1.next();
        }
		System.out.println("Please enter each of their ages!!");
		
        int ages[] = new int[5];   
       
     for(int i=0;i<=4;i++)
        {
           Scanner sc=new Scanner (System.in);
            ages[i]=sc.nextInt();
        }		
      for(int i=0;i<4;i++)
    {
        int l=i;
        for (int k=i+1;k<5;k++)
        {
            if(ages[k]<ages[l])
            {
                l = k;
            }
        }
        if (i != l) 
        {
            String temp=students[i];
            students[i]=students[l];
            students[l]=temp;
			int tem=ages[i];
            ages[i]=ages[l];	
            ages[l]=tem;
        }
    }
	System.out.println("This is the students in ascending order");
        for (int j=0;j<5;j++) 
    {
        System.out.println(students[j]+" ");
    }
    System.out.println("This is the ages in descending order");	
	        for (int j=4;j>-1;j--) 
    {
        System.out.println(ages[j]+" ");
    }
	}
	catch(Exception e)
	{
	 System.out.println("There was an error!");
	}
	finally{};
	{
	System.out.println("Bye,Bye!");
	}
	}
	
}
	