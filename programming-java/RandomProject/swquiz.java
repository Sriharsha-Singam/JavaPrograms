import java.util.*;
public class swquiz
{
 void starwars(int anib, int bobi)
  {
   System.out.println("Ready for the Starwars quiz???.\nThen lets go!!");
   int answers[]=new int[10];
   int z=0;
   int hg=0;
   Scanner obj=new Scanner(System.in);
   System.out.println("First question:\nWho is Obi-Wan's master?\n1.Mace Windu.\n2.Qui-gon\n3.Ki-adi Mundi\n4.Yash ratnoo.");
   Scanner one=new Scanner(System.in);
   int a=one.nextInt();
   if(a==2)
    {
	 System.out.println("The force is strong with you.Correct!!!");
	 answers[z]=a;
	 z++;
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is Qui-Gon.");
	   answers[z]=a;
	 hg++;
	   }
	   
   System.out.println("Second question:\nWhich planet did Anakin come from?\n1.Tatooine\n2.Corascant\n3.Alderaan\n4.Geonosis");
   Scanner two=new Scanner(System.in);
   int b=two.nextInt();

   if(b==1)
    {
	 System.out.println("The force is strong with you.Correct!!!");
	 
	
	   answers[z]=b;
	 z++;
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is Tatooine.");
	   
	   answers[z]=b;
	 hg++;
	   }
	   
   System.out.println("Third question:\nWho is Yoda's padawan?\n1.Captain America\n2.Ki-adi Mundi\n3.Shaak Ti\n4.Count Dooku");
   Scanner three=new Scanner(System.in);
   int c=three.nextInt();

   if(c==4)
    {
	 System.out.println("The force is strong with you.Correct!!!");
	 
	
	   answers[z]=c;
	 z++;
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is Count Dooku.");
	 
	   answers[z]=c;
	 hg++;
	   }
	   
   System.out.println("Fourth question:\nLuke Skywalker is trained by who later in his life?\n1.Yoda\n2.Han Solo\n3.Obi-wan\n4.Starkiller");
   Scanner four=new Scanner(System.in);
   int d=four.nextInt();

   if(d==1)
    {
	 System.out.println("The force is strong with you.Correct!!!");
	
	   answers[z]=d;
	 z++;
	 
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is Yoda.");
	 
	   answers[z]=d;
	 hg++;
	   }
	   
 System.out.println("Fifth question:\nHow old is Padme when she becomes the queen of Naboo?\n1.1\n2.14\n3.22\n4.17");
   Scanner five=new Scanner(System.in);
   int e=five.nextInt();

   if(e==2)
    {
	 System.out.println("The force is strong with you.Correct!!!");
	 
	
	   answers[z]=e;
	 z++;
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is 14.");
	
	   answers[z]=e;
	 hg++;
	   }
	     System.out.println("Sixth question:\nWho is Han-Solo's companion?\n1.Yoda\n2.Luke Skywalker\n3.Chewbacca\n4.Rowley");
         Scanner six=new Scanner(System.in);
         int g=six.nextInt();
		
       if(g==3)
     {
	   System.out.println("The force is strong with you.Correct!!!");
	   
	   answers[z]=g;
	 z++;
	 
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is Chewbacca.");
	   
	   answers[z]=g;
	 hg++;
	   }
	   
	    
	 
   System.out.println("Seventh question:\nObi-Wan takes on Darth Maul as a:\n1.Padawan\n2.Master\n3.Football fan\n4.Jedi Knight");
   Scanner seven=new Scanner(System.in);
   int f=seven.nextInt();

   if(f==1)
    {
	 System.out.println("The force is strong with you.Correct!!!");

	   answers[z]=f;
	 z++;
	 
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is Padawan.");
	 
	   answers[z]=f;
	 hg++;
	   }
   
   System.out.println("Eigth question:\nAnakin had a midochlorian count higher than ?\n1.1000\n2.52\n3.45\n4.20000");
   Scanner eight=new Scanner(System.in);
   int h=eight.nextInt();

    if(h==4)
     {
	 System.out.println("The force is strong with you.Correct!!!");
	 
	   answers[z]=h;
	 z++;
	 
	  }
	 else 
	  {
	   System.out.println("Much to learn you still have.The answer is 10000.");
	  
	   answers[z]=h;
	 hg++;
	   }
	   
   System.out.println("Ninth question:\nJabba the hutt is a what?\n1.Sith\n2.Jedi\n3.Gangster\n4.Droid");
   Scanner nine=new Scanner(System.in);
   int i=nine.nextInt();

   if(i==3)
    {
	 System.out.println("The force is strong with you.Correct!!!");
	 
	   answers[z]=i;
	 z++;
	 
	  }
	 else 
	  {
	    System.out.println("Much to learn you still have.He was a gangster.");
	  
	     answers[z]=i;
	     hg++;
	   }
   
   System.out.println("tenth question:\nWho flew the Nubian spacecraft to Corascunt in episode 1?\n1.Yoda\n2.Luke Skywalker\n3.Chewbacca\n4.Ric Oley");
   Scanner ten=new Scanner(System.in);
   int j=ten.nextInt();

   if(j==4)
    {
	  System.out.println("The force is strong with you.Correct!!!");
	
	   answers[z]=j;
	  z++;
	 
	  }
	 else 
	  {
	     System.out.println("Much to learn you still have.The answer is Ric Oley.");
	  
	     answers[z]=j;
	    hg++;
	   }
	    Calendar caled = Calendar.getInstance();
		int jabathehutt=caled.get(Calendar.MINUTE);
		int jabbathehutt=caled.get(Calendar.SECOND);
		int aniobi = jabathehutt-anib;
		int kushuani = jabbathehutt-bobi;
		System.out.println("The time you took was "+aniobi+"."+kushuani+" Minutes \nMay the FORCE be with you -- Jedi Master Kush Advice!!");

	
	  System.out.println("You got " +z+ " correct and you got " +hg+ " wrong!!!"); 
    }
	  	public static void main(String args[])
	{
	  Calendar cal = Calendar.getInstance();
	  int jaba =cal.get(Calendar.MINUTE);
	  int jabahutt =cal.get(Calendar.SECOND);
	  System.out.println("STARWARS");
	  swquiz yoda=new swquiz();
	  yoda.starwars(jaba,jabahutt);
	  System.out.println("STARWARS ROCKS-- LIKE HELL ");
	  System.out.println("MADE BY KUSH -- JEDI MASTER ");
	}
}
	    
	    


 
	   
   