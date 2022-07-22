package Array;
import java.util.Scanner;

public class CapitaliseWord {
  
    // if lower case character, return true else fale
    static boolean isLowerCase(char ch)
     {
        return (ch>='a' && ch<='z');
     }
    // capitalise lowercase to uppercase 
    // else return a character as it is
    // if we found character 'a' so ASCII value of 'a' is 97, 97-97+65=65 that is 'A'
    // return ch in capital letter
    static char capitalise(char ch ) 
     {
        return  (char) (ch - 'a' + 'A');
     }

   static void capitalise(char[] arr)
   {
    for(int i=0; i<arr.length; i++)
    {
        if(isLowerCase(arr[i]))
        {
            if(i == 0 || arr[i-1] == ' ')
            {
             arr[i] = capitalise(arr[i]);
            }
        }
    }
    System.out.println(arr);
   }

    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine(); 
    char[] arr = str.toCharArray();
    capitalise(arr); 
    }
}
