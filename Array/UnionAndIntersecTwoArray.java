package Array;
import java.util.Scanner;
import java.util.Arrays;
public class UnionAndIntersecTwoArray {
    
 static void twoArr(int arr1[], int arr2[], int n )
 {
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            if(arr1[i] == arr2[j])
            {
                System.out.println(arr1[i]);
            }
        }
    }
 }



   public static void main(String ags[])
   {
      Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int arr1[] = new int[n];
      int arr2[] = new int[n];

      System.out.print("Enter first Array : ");
      for(int i=0; i<n; i++)
      {
        arr1[i] = sc.nextInt();
      }

      System.out.print("Enter second Array : ");
      for(int i=0; i<n; i++)
      {
        arr2[i] = sc.nextInt();
      }
      
      System.out.println("Common element are : ");
      twoArr(arr1, arr2, n);

    } 
}
