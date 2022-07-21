package Array;
import java.util.Scanner;
import java.util.Arrays;
public class moveNegativeOneSide {
    
public static void moveNum(int arr[], int n)
{
    for(int i=0; i<n; i++)
    {
        Arrays.sort(arr);
        System.out.print(arr[i] + " ");
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
    
    moveNum(arr,n); // Calling Function
 }
}
