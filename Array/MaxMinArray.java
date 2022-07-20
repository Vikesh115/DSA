package Array;

import java.util.Scanner;

public class MaxMinArray {
    
static int Max(int[] arr, int n)
   {
    int i;
     int max = arr[0];

    for(i=0; i<n; i++)
    {
        if(arr[i]>max);
        {
            max = arr[i];
        }
    }
    return max;
   }



   public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int arr[] = new int[n];
         for(int i = 0; i<n; i++)
         {
           arr[i] = sc.nextInt();
         }
      System.out.println("Max is : " + Max(arr, n));
    }

}