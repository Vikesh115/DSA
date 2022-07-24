//Sort an array of 0s, 1s and 2s | Dutch National Flag problem

package Array;
import java.util.Scanner;
public class sortArray {
    
    public static void sorting(int arr[], int n) 
    {
           int lo = 0;
		int hi = n - 1;
		int mid = 0, temp = 0;
    // Iterate till all the elements
    // are sorted
		while (mid <= hi) {
			switch (arr[mid]) {
            // if the element is 0    
			case 0: {
				temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
				break;
			}
            // if the element is 1
			case 1:
				mid++;
				break;
            // if the element is 2    
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
