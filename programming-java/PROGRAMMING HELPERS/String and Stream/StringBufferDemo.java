import java.util.*;
public class StringBufferDemo
{
	public static void main(String a[])
	{
		String f = new String("First");
		String s = new String("Second");
		StringBuffer first = new StringBuffer("First");
		StringBuffer second = new StringBuffer("Second");
		StringBuffer third = new StringBuffer("Third");
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
			
		System.out.println("length");
		System.out.println("-----------------------------");			
		System.out.println("length for First ==>" + first.length());//Returns total number of characters in string
		System.out.println("SetLength");
		System.out.println("-----------------------------");			
		first.setLength(10);//setLength to zero will clear the data in string
		System.out.println("After Set length for First by 10==>" + first.length());		
		System.out.println("-----------------------------");
		System.out.println("append");
		System.out.println("-----------------------------");		
		System.out.println("String Append for First with Second" + first.append(second));
		System.out.println("-----------------------------");		
		System.out.println("capacity");
		System.out.println("-----------------------------");		
		System.out.println("Capacity for First and Second" + first.capacity() + " " + second.capacity());//Returns maximum number of character that can be inserted
		System.out.println("-----------------------------");	
		System.out.println("Append capacity ");
		System.out.println("-----------------------------");		
		System.out.println("Capacity for First and Second" + first.append(second).capacity());
		System.out.println("-----------------------------");
		System.out.println("insert");
		System.out.println("-----------------------------");		
		System.out.println("String insert for First with abcd at 5 ==> " + first.append(second).length());
		System.out.println("-----------------------------");
		System.out.println("delete");
		System.out.println("-----------------------------");		
		System.out.println("String delete for First with t ==> " + first.delete(0,4));//beg,end
		System.out.println("-----------------------------");	
		System.out.println("Reverse");
		System.out.println("-----------------------------");				
		System.out.println("String Reverse for Third ==>" + third.reverse());
		System.out.println("-----------------------------");
		System.out.println("Chaining Calls");
		System.out.println("-----------------------------");				
		System.out.println("Chaining Call with append ==>" + second.append(first).append(third).append("Sample"));
				
	}
}