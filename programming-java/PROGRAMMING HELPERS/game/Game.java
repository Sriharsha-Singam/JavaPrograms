import java.util.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class Game extends JFrame
{
        @SuppressWarnings("serial")
  

private static final int FONT_SIZE = 20;
private static final int NUMBER_OF_REPEATS = 5;
private static final String TEXT = new String("0123456789/*-+/<>?;:[]~!@#$%^&*()+=abcdefghijklmnopqrstuvwxyz");
private static JPanel panel = new JPanel(null);
private static Random random = new Random();
private static JLabel label[] = new JLabel[NUMBER_OF_REPEATS];

public void MatrixRain() {        
    this.add(panel);
    panel.setBackground(Color.BLACK);
}

public void scroll() {
    //array to hold x coordinates for the labels
    int[] random_x = new int[NUMBER_OF_REPEATS];
    //create an infinite loop
    while (true) {
        //initialise all the labels to random characters
        for (int i = 0; i < NUMBER_OF_REPEATS; i++) {
          int character_initial = random.nextInt(TEXT.length());
          random_x[i] = random.nextInt(panel.getWidth() / FONT_SIZE) - 1;
          label[i] = new JLabel("" + TEXT.charAt(character_initial));
          panel.add(label[i]);
          label[i].setFont(new Font("monospaced", Font.PLAIN, FONT_SIZE));
        label[i].setForeground(new Color(0, 255, 0));
     }
    // change the text of the labels and their position
    for (int j = 0; j < (panel.getHeight() / FONT_SIZE) * 2; j++) {
        int character = random.nextInt(TEXT.length());
        //move each character
        for (int i = 0; i < NUMBER_OF_REPEATS; i++) {
            label[i].setBounds(random_x[i] * FONT_SIZE, j * (FONT_SIZE / 2), FONT_SIZE, FONT_SIZE);
            label[i].setText("" + TEXT.charAt(character));
            label[i].setForeground(new Color(0, 255 - (j * 5), 0));     
            for (int k = 0; k < NUMBER_OF_REPEATS; k++) {
                int character_initial = random.nextInt(TEXT.length());
                random_x[k] = random.nextInt(panel.getWidth() / FONT_SIZE) - 1;
                label[k] = new JLabel("" + TEXT.charAt(character_initial));
                panel.add(label[k]);
                label[k].setFont(new Font("monospaced", Font.PLAIN, FONT_SIZE));
                label[k].setForeground(new Color(0, 255, 0));
                Color colour = label[k].getForeground();
                if (colour.getGreen() <= 80) {
                    panel.remove(label[k]);
                    k = (panel.getHeight() / FONT_SIZE) * 2;
                }
            }
        }
        
        try {
            Thread.sleep(15);
        } catch (Exception e) {
        }
     }
  }
}

    public static void main(String arg[])
    {
        System.out.println("Welcome to Isha Home School -- Game Zone\n------------------------------------------");
        System.out.print("Shall we play a game\n");       
        System.out.print("1) Game 1 \n2) Game 2 \n3) M@t^Ix \n4)the actual Matrix Rain!!!");
        System.out.println("\nYour Option");
        Scanner input = new Scanner(System.in);
        char option = input.next().charAt(0);
        switch (option)
        {
		   case '4':
		       Game frame = new Game();
               frame.setVisible(true);
                frame.setSize(600, 400);
               frame.setResizable(false);
                frame.setMinimumSize(new Dimension(300, 200));
                frame.setLocationRelativeTo(null);
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
                     frame.scroll();
	              break;
		
  

            case '1':
                System.out.println("Think a Number from [1-9]");
                System.out.println("Can I Proceed [y\\Yes | n\\No]"); 
                Scanner confirm1 = new Scanner(System.in);
                char option2 = confirm1.next().charAt(0);
                if(option2=='y' || option2=='Y')
                {
                     System.out.println("Multiply the Number by 2 and remember the result in your mind");                     
                     System.out.println("Now Add 10 to the number and remember the result");
                     System.out.println("Can I Proceed [y-Yes | n-No]");
                     Scanner confirm2 = new Scanner(System.in);
                     char option3 = confirm2.next().charAt(0);
                     if(option2=='y' || option2=='Y')
                     {
                         System.out.println("Can you divide the result by two and");                         
                         System.out.print("Enter the result and close your left eye");
                         Scanner confirm3 = new Scanner(System.in);
                         int yournumber = confirm3.nextInt();
                         System.out.println("Your number is" + (yournumber - 5));
                         System.out.println("Hey !! I Win the Game");
                         System.out.println("Thanks for using me..Bye Bye");
                         System.exit(0);
                     }
                     else if (option2=='n' || option2=='N')
                     {
                         System.out.println("Oh No ..you dont want me..Good Bye");
                         System.exit(0);
                     }
                     else
                     {
                         System.out.println("Invalid Option...Read the instruction carefully");
                         System.out.println("Play me Again");
                         System.exit(0);
                     }                     
                }
                else if (option2=='n' || option2=='N')
                {
                    System.out.println("Thanks for using and hope you are missing me..Bye Bye");
                    System.exit(0);
                }
                else
                {
                     System.out.println("Invalid Option...Read the instruction carefully");
                     System.out.println("Play me Again");
                     System.exit(0);   
                }
                break;
            case '2': 
                 System.out.println("Think a Number from [1-9]");
                 System.out.println("Multiply the Number by 2 and remember the result in your mind");   
                 System.out.println("Can I Proceed [y\\Yes | n\\No]"); 
                 Scanner confirm4 = new Scanner(System.in);
                 char option4 = confirm4.next().charAt(0);
                 if(option4=='y' || option4=='Y')
                 {                                       
                     System.out.println("Now Add 5 to the number and remember the result");
                     System.out.println("Choose your favourite number from [0-9]");
                     Scanner scanint = new Scanner(System.in);
                     int k = scanint.nextInt();
                     System.out.println("Thanks Yaar.");
                     System.out.println("Now Multiply the result with 5 in your mind");
                     System.out.println("Can I Proceed [y-Yes | n-No]");
                     Scanner confirm2 = new Scanner(System.in);
                     char option5 = confirm2.next().charAt(0);
                     if(option5=='y' || option5=='Y')
                     {
                         System.out.println("Can you pick another number from 1 - 9 and remember it");
                         System.out.println("Now Add that number to your previous result");
                         System.out.print("Produce the sound meow..meow..meow.. \nEnter the result\n");
                         Scanner confirm13 = new Scanner(System.in);
                         int yournumber1 = confirm13.nextInt();                        
                         System.out.println("Your first number is " + (yournumber1 - 25)/10);
                         System.out.println("Your second number is " + (yournumber1 - 25)%10);
                         System.out.println("Hey !! I Win the Game");
                         System.out.println("Thanks for using me..Bye Bye");
                         System.exit(0);
                     }
                     else if (option5=='n' || option5=='N')
                     {
                         System.out.println("Oh No ..you dont want me..Good Bye");
                         System.exit(0);
                     }
                     else
                     {
                         System.out.println("Invalid Option...Read the instruction carefully");
                         System.out.println("Play me Again");
                         System.exit(0);
                     } 
                 }
                 else if (option4=='n' || option4=='N')
                 {
                    System.out.println("Thanks for using and hope you are missing me..Bye Bye");
                    System.exit(0);
                }
                else
                {
                     System.out.println("Invalid Option...Read the instruction carefully");
                     System.out.println("Play me Again");
                     System.exit(0);   
                }
                break;
            case '3':
                    int counter=0,counter2=0,counter3=0,counter4=0,counter5=0,counter6=0;
                     System.out.println("Select a Number from the [1-63] ..");
                     System.out.println("I will tell the numbers");
                     System.out.println("Can I Proceed [y-Yes | n-No]");
                     Scanner confirm31 = new Scanner(System.in);
                     char option31 = confirm31.next().charAt(0);
                     if(option31=='y' || option31=='Y')
                     {
                          System.out.println("Is Your Number listed here....read carefully");
                          System.out.println("==========================!@Vel &=========================");
                          System.out.println("1\t3\t5\t7\t9\t11\t13\t15");
                          System.out.println("17\t19\t21\t23\t25\t27\t29\t31");
                          System.out.println("33\t35\t37\t39\t41\t43\t45\t47");
                          System.out.println("49\t51\t53\t55\t57\t59\t61\t63");
                          System.out.println("=&==&==&==&==&==&==&==&==&==&==&==&==&==&==&==&==&==&==&==");
                          System.out.println("Say [1 - Confirm][0 - Not Confirm]");
                          Scanner sans1 = new Scanner(System.in);
                          char ans1 = sans1.next().charAt(0);
                          counter = ans1=='1' ?  counter += 1 : 0;
                          System.out.println("Can I Proceed [y-Yes | n-No]");
                          Scanner con2 = new Scanner(System.in);
                          char confirm32 = con2.next().charAt(0);
                          if(confirm32=='y' || confirm32=='Y')
                          {
                                 System.out.println("Is Your Number listed here....read carefully");
                                 System.out.println("==========================!@Vel ^=========================");
                                 System.out.println("2\t3\t6\t7\t10\t11\t14\t15");
                                 System.out.println("18\t19\t22\t23\t26\t27\t30\t31");
                                 System.out.println("34\t35\t38\t39\t42\t43\t46\t47");
                                 System.out.println("50\t51\t54\t55\t58\t59\t62\t63");
                                 System.out.println("=^==^==^==^==^==^==^==^==^==^==^==^==^==^==^==^==^==^==^==");
                                 System.out.println("Say [1 - Confirm][0 - Not Confirm]");
                                 Scanner sans2 = new Scanner(System.in);
                                 char ans2 = sans2.next().charAt(0);
                                 counter2 = ans2=='1' ?  counter2 += 2 : 0;
                                 System.out.println("Can I Proceed [y-Yes | n-No]");
                                 Scanner con3 = new Scanner(System.in);
                                 char confirm33 = con3.next().charAt(0);
                                 if(confirm33=='y' || confirm33=='Y')
                                 {
                                     System.out.println("Is Your Number listed here....read carefully");
                                     System.out.println("==========================!@Vel $=========================");
                                     System.out.println("4\t5\t6\t7\t12\t13\t14\t15");
                                     System.out.println("20\t21\t22\t23\t28\t29\t30\t31");
                                     System.out.println("36\t37\t38\t39\t44\t45\t46\t47");
                                     System.out.println("52\t53\t54\t55\t60\t61\t62\t63");
                                     System.out.println("=$==$==$==$==$==$==$==$==$==$==$==$==$==$==$==$==$==$==$==");
                                     System.out.println("Say [1 - Confirm][0 - Not Confirm]");
                                     Scanner sans3 = new Scanner(System.in);
                                     char ans3 = sans3.next().charAt(0);
                                     counter3 = ans3=='1' ? counter3 += 4 : 0;
                                     System.out.println("Can I Proceed [y-Yes | n-No]");
                                     Scanner con34 = new Scanner(System.in);
                                     char confirm34 = con34.next().charAt(0);
                                     if(confirm34=='y' || confirm34=='Y')
                                     {
                                          System.out.println("==========================!@Vel ?=========================");
                                          System.out.println("8\t9\t10\t11\t12\t13\t114\t15");
                                          System.out.println("24\t25\t26\t27\t28\t29\t30\t31");
                                          System.out.println("40\t41\t42\t43\t44\t45\t46\t47");
                                          System.out.println("56\t57\t58\t59\t60\t61\t62\t63");
                                          System.out.println("=?==?==?==?==?==?==?==?==?==?==?==?==?==?==?==?==?==?==?==");
                                          System.out.println("Say [1 - Confirm][0 - Not Confirm]");
                                          Scanner sans4 = new Scanner(System.in);
                                          char ans4 = sans4.next().charAt(0);
                                          counter4 = ans4=='1' ? counter4 += 8 : 0;
                                          System.out.println("Can I Proceed [y-Yes | n-No]");
                                          Scanner con35 = new Scanner(System.in);
                                          char confirm35 = con35.next().charAt(0);
                                          if(confirm35=='y' || confirm35=='Y')
                                          {
                                               System.out.println("==========================!@Vel ~=========================");
                                               System.out.println("16\t17\t18\t19\t20\t21\t22\t23");
                                               System.out.println("24\t25\t26\t27\t28\t29\t30\t31");
                                               System.out.println("48\t49\t50\t51\t52\t53\t54\t55");
                                               System.out.println("56\t57\t58\t59\t60\t61\t62\t63");
                                               System.out.println("=~==~==~==~==~==~==~==~==~==~==~==~==~==~==~==~==~==~==~==");
                                               System.out.println("Say [1 - Confirm][0 - Not Confirm]");
                                               Scanner sans5 = new Scanner(System.in);
                                               char ans5 = sans5.next().charAt(0);
                                               counter5 = ans5=='1' ? counter5 += 16 : 0;
                                               System.out.println("Can I Proceed [y-Yes | n-No]");
                                               Scanner con36 = new Scanner(System.in);
                                               char confirm36 = con36.next().charAt(0);
                                               if(confirm36=='y' || confirm36=='Y')
                                               {
                                                   System.out.println("==========================!@Vel *=========================");
                                                   System.out.println("32\t33\t34\t35\t36\t37\t38\t39");
                                                   System.out.println("40\t41\t42\t43\t44\t45\t46\t47");
                                                   System.out.println("48\t49\t50\t51\t52\t53\t54\t55");
                                                   System.out.println("56\t57\t58\t59\t60\t61\t62\t63");
                                                   System.out.println("=*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==");
                                                   System.out.println("Say [1 - Confirm][0 - Not Confirm]");
                                                   Scanner sans6 = new Scanner(System.in);
                                                   char ans6 = sans6.next().charAt(0);
                                                   counter6 = ans6=='1' ? counter6 += 32 : 0;
                                                   System.out.println("Your number is " + (counter + counter2 + counter3 + counter4 + counter5 + counter6));                                                   
                                               }
                                               else if (confirm36=='n' || confirm36=='N')
                                               {
                                                   System.out.println("This is not fair....");
                                                   System.exit(0);
                                               }
                                               else
                                               {
                                                   System.out.println("Invalid Option...Read the instruction carefully");
                                                   System.out.println("Play me Again");
                                                   System.exit(0);   
                                               }
                                          }
                                          else if (confirm35=='n' || confirm35=='N')
                                          {
                                              System.out.println("This is not fair....");
                                              System.exit(0);
                                          }
                                          else
                                          {
                                              System.out.println("Invalid Option...Read the instruction carefully");
                                              System.out.println("Play me Again");
                                              System.exit(0);   
                                          }
                                     }
                                     else if (confirm34=='n' || confirm34=='N')
                                     {
                                         System.out.println("This is not fair....");
                                         System.exit(0);
                                     }
                                     else
                                     {
                                        System.out.println("Invalid Option...Read the instruction carefully");
                                        System.out.println("Play me Again");
                                        System.exit(0);   
                                     }
                                 }
                                 else if (confirm33=='n' || confirm33=='N')
                                 {
                                     System.out.println("This is not fair....");
                                     System.exit(0);
                                 }
                                 else
                                 {
                                        System.out.println("Invalid Option...Read the instruction carefully");
                                        System.out.println("Play me Again");
                                        System.exit(0);   
                                 }
                          }
                          else if (confirm32=='n' || confirm32=='N')
                          {
                                System.out.println("This is not fair....");
                                System.exit(0);
                          }
                          else
                          {
                                System.out.println("Invalid Option...Read the instruction carefully");
                                System.out.println("Play me Again");
                                System.exit(0);   
                          }
                     }
                     else if (option31=='n' || option31=='N')
                     {
                        System.out.println("Thanks for using and hope you are missing me..Bye Bye");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("Invalid Option...Read the instruction carefully");
                        System.out.println("Play me Again");
                        System.exit(0);   
                    }
                    break;
			

            default:
                 System.out.println("Invalid Option...Read the instruction carefully");
                 System.out.println("Play me Again");
        }                   
    }
}
