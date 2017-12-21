
public class Array
{
    public static void main(String args[]) 
    { 
        int marks[] = new int[5];   
       
      
        marks[0] = 100; 
        marks[1] = 60; 
        marks[2] = 70; 
        marks[3] = 80; 
        marks[4] = 90;   
		String students[] =new String[5];
		
		students[0]="Sriharsha Singam";
		students[1]="Kush Patel";
		students[2]="Aneesh Kumar";
		students[3]="Sashwatha";
		students[4]="Sarvanan Anna";
      
        for(int i = 0; i < marks.length; i++) 
        { 
            System.out.println(students[i] + "\t="+marks[i]+"%"); 
             
        }          
    } 
}
