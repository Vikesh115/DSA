//Given an array Arr[] of N integers. Find the contiguous sub-array(containing 
//at least one number) which has the maximum sum and return its sum.
package Algoirthm;
import java.util.Scanner;

public class KadaneAlgo {
    
    static int sum = 0;
    static void kadanAlgo(int arr[], int n)
    {
        for(int i =0; i<n; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        kadanAlgo(arr,n);
    }
}
