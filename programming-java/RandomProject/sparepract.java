import java.util.*;
public class sparepract
{
	public static void main(String args[])
	{
		try
		{
	
			int nos[] = new int[10];
			System.out.println("please enter 10 positive numbers");
			Scanner sc = new Scanner(System.in);
			
			for(int a=0; a<10; a++)
			{
				nos[a] = sc.nextInt();
			}
			
		
			for(int g=0; g<9; g++)
			{
				int min=g;
				for(int k=g+1; k<10; k++)
				{
					if(nos[k]<nos[min])
					{
						min = k;
					}
				}
				
				if(g!=min)
				{
					int swap = nos[g];
					nos[g] = nos[min];
					nos[min] = swap;
				}
			}
			
			//reducing it to no reccurences...
			
			int norec[] = new int[10];
			int s=0; 
			int l=1;
			norec[0] = nos[0];
			
			while(l<10)
			{
				if(nos[l] != norec[s])
				{
					s=s+1;
					norec[s] = nos[l];
					l=l+1;
				}
				
				else
				{
					l = l+1;
				}
			}
			
			//displaying the condensed version...
			
			System.out.println("");
			s=0;
			while( s<10)
			{
				System.out.println(norec[s]+"");
				s+=1;
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}