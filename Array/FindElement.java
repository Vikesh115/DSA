package Array;

import java.util.Scanner;
import java.util.Arrays;
public class FindElement {
    
    static void findElement(int arr[], int n)
    {
        for(int i = 0; i<n; i++)
        {
            Arrays.sort(arr);
            
        }
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

        findElement(arr, n);
    }
}
