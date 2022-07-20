package Array;

import java.util.Scanner;

public class MaxMinArray
{
   public static void main(String[] args)
    {
         int n,i,maxVal,minVal;

         Scanner sc = new Scanner(System.in);
          n = sc.nextInt();

         int arr[] = new int[n];
         for( i = 0; i<n; i++)
         {
           arr[i] = sc.nextInt();
         }

         maxVal = minVal = arr[0];
    
        for( i=1; i<n; i++){
            if(maxVal < arr[i]){
            maxVal = arr[i];
            }
            else if(minVal > arr[i]){
                minVal = arr[i];
            }
        }
        System.out.println("Min is : " + minVal);
        System.out.println("Max is : " + maxVal);
    }

}