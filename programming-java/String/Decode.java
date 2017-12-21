import java.io.*;
/*
A simple encryption system uses a shifting process to hide a message. The value of the shift can be in the range 1 to 26. For example a shift of 7 means that A = U, B =V,C = W, etc.i e.

Text : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Code : U V W X Y Z A B C D E F G H I J K L M N O P Q R S T

Fist an extra space is added to the end of the string. To make things little more difficult, spaces within the original text are replaced with QQ before the text is encrypted. Double Q (QQ) was selected because no English word ends in Q or contains QQ.

Additionally the coded message is printed in blocks of six characters separated by spaces.
 The last block might not contain six characters. 
 Write a program that takes the coded text (less than 100 characters),
 the shift value and prints the decoded original text.Your program must reject 
 any non-valid value for shift and display an error message "INVALID SHIFT VALUE)".
 Assume all characters are upper case.
*/
public class Decode
{  
    public static void main(String aaa[])throws IOException
    {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Coded Text : "); // inputting coded text
        String s = br.readLine();
        int l = s.length();
        s = s.toUpperCase(); // converting the coded text into Uppercase
        s = s + " "; // adding a space at the end
        if(l>=100) // checking whether length of inputted code is less than 100
            System.out.println("!!! Invalid Length of Coded Text !!!");
        else
        {
            System.out.print("Enter the Shift Value : ");
            int shift = Integer.parseInt(br.readLine());
            if(shift<1 || shift>26) // checking whether shift value is between 1 and 26
                System.out.println("!!! Invalid Shift Value !!!");
            else
            {
                int a, b;
                char ch1, ch2;
                String dec=""; //new String for storing the decoded text
                
                for(int i=0; i<l; i++)
                {
                    ch1 = s.charAt(i); // extracting characters one by one
                    ch2 = s.charAt(i+1); // extracting the next character
 
                    /* Below we are adding shift value to the characters
                     * if ch1 = 'A' and shift = 7,
                     * then ch1 + shift - 1 will give us: 'A'+7-1 = 65+7-1 = 71
                     * which is the ASCII value of 'G'
                     */
                    a = ch1 + shift - 1; // storing ASCII values after adding shift to the current character
                    b = ch2 + shift - 1; // storing ASCII values after adding shift to the next character
 
                    /* If the currrent character and the next character are both 'Q' then we have a 'space'
                     * hence the ASCII value should be 32
                     */
                    if((char)a == 'Q' && (char)b == 'Q')
                    {
                        a = 32;
                        i++;
                    }
 
                    /* If ASCII value after adding the shift becomes more than 90,
                     * then we subtract 26 from it, to make it circular,
                     * eg. 'U'+7-1 = 85+7-1 = 91, but we want 'A' whose ASCII value is 65
                     * so 91-26 will give us 65
                     */
                    if(a>90)
                        a = a - 26;
                    dec = dec + (char)a; // finally adding the decoded character to the new String
                }
            System.out.println("Decoded Text : "+dec);
            }
        }
    }
}
/*
1. INPUT:
CODED TEXT : "UHINBY LKKQCH HYLKK"
SHIFT : 7
OUTPUT:
DECODED TEXT : ANOTHER VALUE

2. INPUT:
CODED TEXT : "RUIJGG EVGGBK SAGG"
SHIFT : 11
OUTPUT:
DECODED TEST : BEST OF LUCK

3. INPUT:
CODED TEXT : "DKSMMW NAMMUK QMM"
SHIFT : 29
OUTPUT:
INVALID SHIFT VAULE

Example 4:
Enter Coded Text : UHINBYLKKQCHHYLKK
Enter the Shift Value : 7
Decoded Text : ANOTHER WINNER

Example 5:
Enter Coded Text : RUIJGGEVGGBKSAGG
Enter the Shift Value : 11
Decoded Text : BEST OF LUCK

Example 6:
Enter Coded Text : UHINBYLKKQCHHYLKK
Enter the Shift Value : 27
Invalid Shift Value.

*/