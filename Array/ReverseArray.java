package Array;
import java.util.Scanner;

public class ReverseArray {
        static void RevArr(int arr[], int start, int end)
        {
            int temp;
            while(start<end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

static void printArray(int arr[], int n)
        {
         for (int i = 0; i < n; i++)
          System.out.print(arr[i] + " ");
          System.out.println();
        }

public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        RevArr(arr, 0, n-1);
        System.out.print("Reversed array is : ");
        printArray(arr, n);
    }
}