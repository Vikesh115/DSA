package Array;

import java.util.Scanner;
public class rotationArray {
    
    static void rotate(int arr[], int d, int n)
    {
        int temp[] = new int[n];
        int i=0;
        int k = 0;
    
        // iterate d to n-1
        for ( i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }
    
        // iterate 1 to d
        for ( i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
        
        // swap array int old array
        for ( i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    static void print(int arr[], int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }
    

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d=2;
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
      {
        arr[i] = sc.nextInt();
      }
      rotate(arr,d, n);
      print(arr,n);
    }
}
