package Array;

import java.util.Scanner;
import java.util.Arrays;
public class mergeArray {
    
    static void mergeArr(int arr1[], int arr2[], int res[], int n,int m)
    {
        int k=0, i =0, j=0;
      while(i<n)
      {
        res[k] = arr1[i];
        k++;
        i++;
      }
       while(j<m)      
      {
         res[k] = arr2[j];
         k++;
         j++;
      }

       Arrays.sort(res);
       for( i=0; i<n+m; i++)
       {
        System.out.print(res[i] + " ");
       }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int res[] = new int[n+m];
        for(int i=0; i<n; i++)
        {
          arr1[i] = sc.nextInt();
        }

        for(int j=0; j<m; j++)
        {
            arr2[j] = sc.nextInt();
        }
   
          mergeArr(arr1,arr2,res,n,m);

    }
}
