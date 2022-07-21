package Array;
// import java.util.Arrays;
import java.util.Scanner;
public class sortArray {
    
    public static void sorting(int arr[], int n) 
    {
        // if(arr[i] == 0 || arr[i] == 1 || arr[i] == 2)
        // {
           //Arrays.sort(arr);
           int lo = 0;
		int hi = n - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
				break;
			}
			}
        }
        }
        static void printArray(int arr[], int n)
        {
            int i;
            for (i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println("");
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

     sorting(arr,n); // Calling function
     printArray(arr, n);
}
}
