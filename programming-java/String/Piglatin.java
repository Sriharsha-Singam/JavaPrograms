import java.io.*;
class Piglatin
    {
    public static void main(String[] aaa)throws IOException
        {
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Enter any word: ");
            String s=br.readLine();
            s=s.toUpperCase(); //converting the word into Uppercase
            int l=s.length();
            int pos=0;
            char ch;
            for(int i=0; i<l; i++)
            {
                ch=s.charAt(i);
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    pos=i; //storing the index of the first vowel
                    break;
                }
            }
            String a=s.substring(pos); //extracting all alphabets in the word beginning from the first vowel
            String b=s.substring(0,pos); //extracting the alphabets present before the first vowel
            String pig=a+b+"AY"; //adding "AY" at the end of the extracted words after joining them
            System.out.println("The Piglatin of the word = "+pig);
        }
    }

