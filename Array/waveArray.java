package Array;

import java.util.Scanner;

public class waveArray {
    
    static void sortArray(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                int temp =0;
                if(arr[j] > arr[i])
                {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= s.nextInt();
        }
        sortArray(arr,n);
    }
}
