// Write an efficient program to find the sum of the contiguous 
// subarray within a one-dimensional array of numbers that has the largest sum. 
package Array;
import java.util.Scanner;

public class largestSubarraySum {

    static void subarrSum(int arr[], int n)
    {
        int sum =0;
    int max1 = 0;
    int max2 = 0;
       for(int i=0; i<n; i++)
       {
           if(arr[i]>max1)
           {
            max1 = i;
           }

            if(arr[i] < max1)
            {
            max2 = i;
            }

           for(int j=0; j<n; i++)
           {
            if(max1>=max2)
            sum = arr[j]+sum;
           }
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

        subarrSum(arr, n);

    }
}
