package Array;
import java.util.Scanner;

public class FindArrayElement {
    public static  void main(String[] args)
    {
        int element = 2;
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        int[] arr = new int[n]; 
        for(int i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }

        boolean ans = false;
        for(int i=0; i<n; i++)
        {
         if(arr[i] == element){
            System.out.println("Found");
            ans = true;
            break; // Come out from current loop
         } 
        }       
       System.out.println("Element found : " + ans);
    }
}
