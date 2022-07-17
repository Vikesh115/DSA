package Array;
import java.util.Scanner;
public class ReverseNum{
    public static void main(String[] args)
    {
        int ans=0;
        int digit = 0;
        //int num= 143;
        System.out.print("Enter Number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        while(num!=0)
        {
            digit = num%10; // Abstract digit
            ans = ans*10 + digit; // Add with digit
            num = num/10; // Remove last digit
        }
        System.out.println("Reverse number : " + ans);
    } 
}