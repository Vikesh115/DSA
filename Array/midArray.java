package Array;

import java.util.Scanner;

public class midArray {

   static void MidArray(int arr[], int n)
   {
      for(int i=0; i<n; i++)
      {
        
        System.out.println((arr[n-1]+arr[0])/2);
        break;
      }
   }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        MidArray(arr, n);
    }
}
